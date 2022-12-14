package com.indocyber.Services.Interfaces;

import com.indocyber.Entities.Course;

import java.util.List;

public interface CourseServe {

    void  save(Course course);

    Course findById(int i);

    List<Course> findAllCourse();

    void delete(Course course);
}
