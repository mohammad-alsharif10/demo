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
@Table(name = "STUDENTS_COURSES")
@ApiModel
public class StudentsCourses extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STUDENTS_COURSES_ID")
    private Integer studentCourseId;

    @Column(name = "STUDENT_ID")
    private Integer studentId;

    @Column(name = "COURSE_ID")
    private Integer courseId;

    @Column(name = "MID_EXAM_GRADE")
    private Integer midExamGrade;

    @Column(name = "FINAL_EXAM_GRADE")
    private Integer finalExamGrade;

    @Column(name = "YEAR")
    private String year;

    @Column(name = "IS_SUCCESSFUL")
    private Boolean isSuccessful;
}
