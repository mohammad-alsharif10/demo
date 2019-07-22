package project.demo.models;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "image")
@ApiModel
public class Image extends BaseEntity {

    @Id
    @Column(name = "IMAGE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long imageId;

    @Column(name = "PATH")
    private String path;

    @Column(name = "STUDENT_ID")
    private Long studentId;

    @Column(name = "DOCTOR_ID")
    private Long doctorId;

    @Column(name = "CURRENT_PROFILE_IMAGE")
    private Boolean isCurrentProfileImage;
}
