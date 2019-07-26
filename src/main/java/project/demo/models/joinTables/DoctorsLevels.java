package project.demo.models.joinTables;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import project.demo.models.BaseEntity;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "DOCTORS_LEVELS")
@ApiModel
public class DoctorsLevels extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DOCTORS_LEVELS_ID")
    private Integer doctorsLevelsId;

    @Column(name = "DOCTOR_ID")
    private Integer doctorId;

    @Column(name = "LEVEL_ID")
    private Integer levelId;
}
