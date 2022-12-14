package com.indocyber.Entities;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Instructor")
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "InstructorId")
    private int id;

    @Column(name = "FirstName",length = 50,nullable = false)
    private String firstName;

    @Column(name = "LastName",length = 50,nullable = false)
    private String lastName;

    @Column(name = "Sex",length = 1,nullable = false)
    private String jenisKelamin;

    @Column(name = "HiredDate",nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate hiredDate;

    @Column(name = "Email",nullable = false)
    private String email;

    @Column(name = "Alamat",nullable = false)
    private String address;


//    @LazyCollection(LazyCollectionOption.FALSE)
//    @OneToMany(
//            mappedBy = "instructor",
//            fetch = FetchType.EAGER
//    )
//    private List<Course> courses;

    public Instructor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {return firstName;}

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public LocalDate getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(LocalDate hiredDate) {
        this.hiredDate = hiredDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
//    public List<Course> getCourses() {
//        return courses;
//    }
//
//    public void setCourses(List<Course> courses) {
//        this.courses = courses;
//    }

}
