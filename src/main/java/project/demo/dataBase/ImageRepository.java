package project.demo.dataBase;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import project.demo.models.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {

    Page<Image> findAllByStudentId(Long student, Pageable pageable);

    Page<Image> findAllByDoctorId(Long doctor, Pageable pageable);

    Image findByIsCurrentProfileImage(Boolean param);

    Page<Image> findAllByDoctorIdNotNull(Pageable pageable);


    //    @Query(value = "update images set CURRENT_PROFILE_IMAGE=false where IMAGE_ID = ?1", nativeQuery = true)
//    void setOtherImagesToFalse(Integer imageId);
}
