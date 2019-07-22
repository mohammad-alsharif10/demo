package project.demo.dataBase;


import org.springframework.data.jpa.repository.JpaRepository;
import project.demo.models.Doctor;

import java.util.Optional;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {


    Optional<Doctor> findByUsername(String username);
}
