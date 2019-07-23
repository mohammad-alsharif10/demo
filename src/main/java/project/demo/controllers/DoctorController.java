package project.demo.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import project.demo.models.Doctor;
import project.demo.services.DoctorService;

@AllArgsConstructor
@RestController
@RequestMapping("/doctor")
public class DoctorController extends BaseController<Integer, Doctor> {

    private DoctorService doctorService;

    @Override
    DoctorService getBaseService() {
        return doctorService;
    }

    @Override
    public ResponseEntity listAll(@RequestParam("page") int page,
                                  @RequestParam("size") int size,
                                  @RequestParam(required = false, value = "sort") String sort) {
        return super.listAll(page, size, sort);
    }

    @Override
    public ResponseEntity findById(@RequestParam("id") Integer integer) {
        return super.findById(integer);
    }

    @Override
    public ResponseEntity newEntity(@RequestBody Doctor baseEntity) {
        return super.newEntity(baseEntity);
    }

    @Override
    public ResponseEntity updateEntity(@RequestBody Doctor baseEntity) {
        return super.updateEntity(baseEntity);
    }

    @Override
    public ResponseEntity deleteEntity(@RequestParam("id") Integer entityId) {
        return super.deleteEntity(entityId);
    }
}
