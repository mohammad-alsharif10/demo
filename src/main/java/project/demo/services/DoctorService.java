package project.demo.services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import project.demo.dataBase.DoctorRepository;
import project.demo.models.Doctor;

@Service
@AllArgsConstructor
public class DoctorService extends BaseService<Integer, Doctor> {

    private DoctorRepository doctorRepository;


    @Override
    public DoctorRepository getRepository() {
        return doctorRepository;
    }
}
