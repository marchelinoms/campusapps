package com.indocyber.Services.Implements;

import com.indocyber.Entities.Enrollment;
import com.indocyber.Repositories.EnrollmentRepository;
import com.indocyber.Services.Interfaces.EnrollmentServe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnrollmentService implements EnrollmentServe {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    @Override
    public void save(Enrollment enrollment) {
        this.enrollmentRepository.save(enrollment);
    }

    @Override
    public Enrollment findById(int i) {
        Optional<Enrollment> byId = this.enrollmentRepository.findById(i);
        Enrollment enrollment = byId.get();

        return enrollment ;
    }

    @Override
    public List<Enrollment> findAllEnrollment() {
        return this.enrollmentRepository.findAll();
    }

    @Override
    public void delete(Enrollment enrollment) {
        this.enrollmentRepository.delete(enrollment);
    }
}
