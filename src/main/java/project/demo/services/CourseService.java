package project.demo.services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import project.demo.dataBase.CourseRepository;
import project.demo.models.Course;

@Service
@AllArgsConstructor
public class CourseService extends BaseService<Integer, Course> {

    private CourseRepository courseRepository;


    @Override
    public CourseRepository getRepository() {
        return courseRepository;
    }
}
