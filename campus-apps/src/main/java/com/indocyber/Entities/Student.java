package com.indocyber.Entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "StudentId")
    private int id;

    @Column(name = "FirstName",length = 50,nullable = false)
    private String firstName;

    @Column(name ="LastName",length = 50,nullable = false)
    private String lastName;

    @Column(name = "Sex",length = 1,nullable = false)
    private String jenisKelamin;

    @Column(name = "BirthPlace",length = 50,nullable = false)
    private String tempatLahir;

    @Column(name = "BirthDate",nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate tanggalLahir;

    @Column(name = "Email",nullable = false)
    private String email;

    @Column(name = "Address",nullable = false)
    private String address;

    @OneToMany(mappedBy = "studentId")
    private List<Enrollment> enrollment;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

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

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
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
}
