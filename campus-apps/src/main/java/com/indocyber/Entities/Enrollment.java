package com.indocyber.Entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "StudentEnrollment")
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EnrollmentId")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "StudentId")
    private Student studentId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CourseId")
    private Course courseId;
    @Column(name = "EnrollmentDate")
    private LocalDate enrollmentDate;

    @Column(name = "Periode")
    private String period;

    @Column(name = "PaymentMethod")
    private String paymentMethod;

    public Enrollment() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudentId() {
        return studentId;
    }

    public void setStudentId(Student studentId) {
        this.studentId = studentId;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Course getCourseId() {
        return courseId;
    }

    public void setCourseId(Course courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", courseId=" + courseId +
                ", enrollmentDate=" + enrollmentDate +
                ", period='" + period + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
