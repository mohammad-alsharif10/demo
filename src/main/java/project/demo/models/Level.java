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
@Table(name = "LEVEL")
@ApiModel
public class Level extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LEVEL_ID")
    private Integer levelId;

    @Column(name = "LEVEL_NAME")
    private String levelName;

    @Column(name = "LEVEL_NUMBER")
    private Integer levelNumber;


}
