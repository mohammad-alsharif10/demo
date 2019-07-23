package project.demo.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import project.demo.models.Image;
import project.demo.services.ImageService;


@AllArgsConstructor
@RestController
@RequestMapping("/image")
public class ImageController extends BaseController<Long, Image> {

    private ImageService imageService;

    @Override
    ImageService getBaseService() {
        return imageService;
    }

    @Override
    public ResponseEntity listAll(@RequestParam("page") int page,
                                  @RequestParam("size") int size,
                                  @RequestParam(required = false, value = "sort") String sort) {
        return super.listAll(page, size, sort);
    }

    @Override
    public ResponseEntity findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public ResponseEntity newEntity(@RequestBody Image baseEntity) {
        return super.newEntity(baseEntity);
    }

    @Override
    public ResponseEntity updateEntity(@RequestBody Image baseEntity) {
        return super.updateEntity(baseEntity);
    }

    @Override
    public ResponseEntity deleteEntity(Long entityId) {
        return super.deleteEntity(entityId);
    }
}
