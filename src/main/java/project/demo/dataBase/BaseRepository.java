package project.demo.dataBase;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import project.demo.models.BaseEntity;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository<entity extends BaseEntity, ID extends Serializable>
        extends JpaRepository<entity, ID> {

    @Override
    Page<entity> findAll(Pageable pageable);
}
