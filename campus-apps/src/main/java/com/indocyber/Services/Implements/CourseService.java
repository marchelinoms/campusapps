package com.indocyber.Services.Implements;

import com.indocyber.Entities.Course;
import com.indocyber.Repositories.CourseRepository;
import com.indocyber.Services.Interfaces.CourseServe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService implements CourseServe {
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public void save(Course course) {
        this.courseRepository.save(course);
    }

    @Override
    public Course findById(int i) {

        Optional<Course> byId = this.courseRepository.findById(i);
        Course course = byId.get();

        return course;
    }

    @Override
    public List<Course> findAllCourse() {
        return this.courseRepository.findAll();
    }

    @Override
    public void delete(Course course) {
        this.courseRepository.delete(course);
    }
}
