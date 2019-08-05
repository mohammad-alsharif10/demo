package project.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import project.demo.models.Course;
import project.demo.services.BaseService;
import project.demo.services.CourseService;


@RestController
@RequestMapping("/courses")
public class CourseController extends BaseController<Integer, Course> {

	private CourseService courseService;
	@Override
	BaseService<Integer, Course> getBaseService() {
		return courseService;
	}

	//Get All
	@SuppressWarnings({ "rawtypes" })
	@Override
	public ResponseEntity listAll(@RequestParam("page") int page,
			                      @RequestParam("size") int size,
			                      @RequestParam(required = false, value = "sort") String sort) {
		                          return super.listAll(page, size, sort);
	}
	
	//Get {ID}
	@SuppressWarnings({ "rawtypes" })
	@Override
	public ResponseEntity findById(@RequestParam("id")Integer id) {
		return super.findById(id);
	}

	//Add
	@SuppressWarnings({ "rawtypes" })
	@Override
	public ResponseEntity newEntity(@RequestBody Course baseEntity){
		return super.newEntity(baseEntity);
	}

	//Update 
	@SuppressWarnings({ "rawtypes" })
	@Override
	public ResponseEntity updateEntity(@RequestBody Course baseEntity){
		return super.updateEntity(baseEntity);
	}

	//Delete {ID}
	@SuppressWarnings({ "rawtypes" })
	@Override
	public ResponseEntity deleteEntity(@RequestParam("id") Integer id){
		return super.deleteEntity(id);
	}
}
