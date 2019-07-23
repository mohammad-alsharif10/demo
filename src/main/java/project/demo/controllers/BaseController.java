package project.demo.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import project.demo.models.BaseEntity;
import project.demo.response.SingleResult;
import project.demo.services.BaseService;
import project.demo.utils.ResponseKeys;

import java.io.Serializable;

public abstract class BaseController<ID extends Serializable, baseEntity extends BaseEntity> {

    abstract BaseService<ID, baseEntity> getBaseService();

    @RequestMapping(path = "/list", method = RequestMethod.GET)
    public ResponseEntity listAll(@RequestParam("page") int page,
                                  @RequestParam("size") int size,
                                  @RequestParam(required = false, value = "sort") String sort) {
        return ResponseEntity.status(HttpStatus.OK).body(getBaseService().findAll(page, size, sort));
    }

    @RequestMapping(path = "/find", method = RequestMethod.GET)
    public ResponseEntity findById(@RequestParam(name = "id") ID id) {
        return ResponseEntity.status(HttpStatus.OK).body(getBaseService().findById(id));
    }

    @RequestMapping(path = "/new", method = RequestMethod.POST)
    public ResponseEntity newEntity(@RequestBody baseEntity baseEntity) {
        baseEntity entity = getBaseService().createEntity(baseEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(
                new SingleResult(false, ResponseKeys.OK, entity));

    }

    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    public ResponseEntity updateEntity(@RequestBody baseEntity baseEntity) {
        baseEntity updateEntity = getBaseService().updateEntity(baseEntity);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(
                new SingleResult(false, ResponseKeys.OK, updateEntity));
    }

    @RequestMapping(path = "/delete", method = RequestMethod.DELETE)
    public ResponseEntity deleteEntity(@RequestParam("id") ID entityId) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(getBaseService().delete(entityId));
    }
}

