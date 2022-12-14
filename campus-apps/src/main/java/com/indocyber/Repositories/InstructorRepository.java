package com.indocyber.Repositories;

import com.indocyber.Entities.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor,Integer> {
}
