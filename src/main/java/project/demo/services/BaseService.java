package project.demo.services;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import project.demo.dataBase.BaseRepository;
import project.demo.models.BaseEntity;
import project.demo.response.PageResult;
import project.demo.response.SingleResult;
import project.demo.utils.ResponseKeys;

import java.io.Serializable;
import java.util.Optional;

public abstract class BaseService<ID extends Serializable, E extends BaseEntity> {

    public abstract BaseRepository<E, ID> getRepository();


    public E createEntity(E entity) {
        return getRepository().save(entity);
    }

    public E updateEntity(E entity) {
        return getRepository().save(entity);
    }

    public PageResult findAll(Integer pageNumber, Integer size, String sort) {
        if (sort == null) {
            Page<E> page = getRepository().findAll(PageRequest.of(pageNumber, size));
            return getUnSortedList(page);
        }
        Page<E> page = getRepository().findAll(PageRequest.of(pageNumber, size, Sort.by(sort)));
        return getSortedList(page);
    }

    PageResult getUnSortedList(Page page) {
        if (page.isEmpty()) {
            return new PageResult
                    (true, "empty list", ResponseKeys.EMPTY_LIST, page.getContent(), page.getTotalElements(), page.getTotalPages());
        }
        return new PageResult
                (false, "unsorted filled list ", ResponseKeys.OK, page.getContent(), page.getTotalElements(), page.getTotalPages());
    }

    PageResult getSortedList(Page page) {
        if (page.isEmpty()) {
            return new PageResult
                    (true, "empty list", ResponseKeys.EMPTY_LIST, page.getContent(), page.getTotalElements(), page.getTotalPages());
        }
        return new PageResult
                (false, "sorted filled list ", ResponseKeys.OK, page.getContent(), page.getTotalElements(), page.getTotalPages());
    }


    public SingleResult findById(ID entityId) {
        Optional<E> optional = getRepository().findById(entityId);
        return optional.map(model -> new SingleResult(false, "found the model", ResponseKeys.OK, model))
                .orElseGet(() -> new SingleResult(true, "model not found", ResponseKeys.NOT_FOUND, null));
    }


    public SingleResult delete(ID entityId) {
        Optional<E> optional = getRepository().findById(entityId);
        return optional.map(model -> {
            getRepository().delete(model);
            return new SingleResult(false, "found the model has been deleted successfully", ResponseKeys.OK, model);
        }).orElseGet(() -> new SingleResult(false, "model not found to be deleted", ResponseKeys.NOT_FOUND, null));
    }
}
