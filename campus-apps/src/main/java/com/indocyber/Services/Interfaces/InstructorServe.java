package com.indocyber.Services.Interfaces;

import com.indocyber.Entities.Course;
import com.indocyber.Entities.Instructor;

import java.util.List;

public interface InstructorServe{

    void  save(Instructor instructor);

    Instructor findById(int i);

    List<Instructor> findAllCourse();

    void delete(Instructor instructor);

    List<Instructor> findAllInstructor();
}
