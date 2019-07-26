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
@Table(name = "COURSE")
@ApiModel
public class Course extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COURSE_ID")
    private Integer id;

    @Column(name = "DOCTOR_ID")
    private Integer doctorId;


    @Column(name = "LEVEL_ID")
    private Integer levelId;


    @Column(name = "NAME")
    private String name;


    @Column(name = "MAX_DEGREE")
    private Integer maxDegree;
}
