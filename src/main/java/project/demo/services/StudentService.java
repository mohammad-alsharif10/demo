package project.demo.services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import project.demo.dataBase.StudentRepository;
import project.demo.models.Student;

@Service
@AllArgsConstructor
public class StudentService extends BaseService<Integer, Student> {

    private StudentRepository studentRepository;


    @Override
    public StudentRepository getRepository() {
        return studentRepository;
    }
}
