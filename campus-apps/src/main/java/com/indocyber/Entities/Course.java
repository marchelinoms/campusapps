package com.indocyber.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CourseId")
    private int id;

    @Column(name = "CourseName")
    private String title;

    @Column(name = "CourseDescription")
    private String desc;

    @Column(name = "CoursePeriod",columnDefinition = "VARCHAR")
    private String period;

    @OneToMany(mappedBy = "courseId")
    private List<Enrollment> studentEnroll;

    public Course() {
    }

    public List<Enrollment> getStudentEnroll() {
        return studentEnroll;
    }

    public void setStudentEnroll(List<Enrollment> studentEnroll) {
        this.studentEnroll = studentEnroll;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
}
