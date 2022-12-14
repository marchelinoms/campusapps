package com.indocyber.Services.Interfaces;

import com.indocyber.Entities.Course;
import com.indocyber.Entities.Enrollment;

import java.util.List;

public interface EnrollmentServe {

    void  save(Enrollment enrollment);

    Enrollment findById(int i);

    List<Enrollment> findAllEnrollment();

    void delete(Enrollment enrollment);
}
