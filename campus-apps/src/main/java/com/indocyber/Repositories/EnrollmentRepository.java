package com.indocyber.Repositories;

import com.indocyber.Entities.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment,Integer> {
}
