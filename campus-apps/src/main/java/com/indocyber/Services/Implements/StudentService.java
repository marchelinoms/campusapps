package com.indocyber.Services.Implements;

import com.indocyber.Entities.Student;
import com.indocyber.Repositories.StudentRepository;
import com.indocyber.Services.Interfaces.StudentServe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class StudentService implements StudentServe {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void save(Student student) {
        this.studentRepository.save(student);
    }

    @Override
    public Student findById(int i) {
        Optional<Student> byId = this.studentRepository.findById(i);
        Student student = byId.get();

        return student;
    }

    @Override
    public List<Student> findAllCourse() {
        return this.studentRepository.findAll();
    }

    @Override
    public void delete(Student student) {
        this.studentRepository.delete(student);
    }

    @Override
    public List<Student> findAllStudent() {
        return this.studentRepository.findAll();
    }
}
