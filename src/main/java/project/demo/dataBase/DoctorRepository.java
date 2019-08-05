package project.demo.dataBase;



import project.demo.models.Doctor;

import java.util.Optional;


public interface DoctorRepository extends BaseRepository<Doctor, Integer> {
    Optional<Doctor> findByUsername(String username);
}
