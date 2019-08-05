package project.demo.dataBase;



import project.demo.models.Student;

import java.util.Optional;

public interface StudentRepository extends BaseRepository<Student, Integer> {


    Optional<Student> findByUsername(String username);
}
