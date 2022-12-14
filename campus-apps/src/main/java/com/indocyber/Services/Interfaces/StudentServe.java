package com.indocyber.Services.Interfaces;



import com.indocyber.Entities.Student;

import java.util.List;

public interface StudentServe {

    void  save(Student student);

    Student findById(int i);

    List<Student> findAllCourse();

    void delete(Student student);

    List<Student> findAllStudent();
}
