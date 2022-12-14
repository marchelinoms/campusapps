package com.indocyber.Services.Implements;

import com.indocyber.Entities.Instructor;
import com.indocyber.Repositories.InstructorRepository;
import com.indocyber.Services.Interfaces.InstructorServe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstructorService implements InstructorServe {

    @Autowired
    private InstructorRepository instructorRepository;

    @Override
    public void save(Instructor instructor) {
        this.instructorRepository.save(instructor);
    }

    @Override
    public Instructor findById(int i) {

        Optional<Instructor> byId = this.instructorRepository.findById(i);
        Instructor instructor = byId.get();

        return instructor ;
    }

    @Override
    public List<Instructor> findAllCourse() {
        return this.instructorRepository.findAll();
    }

    @Override
    public void delete(Instructor instructor) {
        this.instructorRepository.delete(instructor);
    }

    @Override
    public List<Instructor> findAllInstructor() {
        return this.instructorRepository.findAll();
    }
}
