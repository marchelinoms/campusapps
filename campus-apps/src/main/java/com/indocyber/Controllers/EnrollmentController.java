package com.indocyber.Controllers;

import com.indocyber.Entities.Course;
import com.indocyber.Entities.Enrollment;
import com.indocyber.Entities.Student;
import com.indocyber.Services.Implements.CourseService;
import com.indocyber.Services.Implements.EnrollmentService;
import com.indocyber.Services.Implements.InstructorService;
import com.indocyber.Services.Implements.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/enrollment")
public class EnrollmentController {
    @Autowired
    private StudentService studentServe;
    @Autowired
    private InstructorService instructorServe;
    @Autowired
    private CourseService courseServe;
    @Autowired
    private EnrollmentService enrollmentServe;

    //Enrolling Student to the Course
    @RequestMapping("/enrollStudent/{id}")
    public String enrollStudent(@PathVariable("id") int id, Model model ){
        Student student = this.studentServe.findById(id);
        model.addAttribute("student", student);
        List<Course>courseList = this.courseServe.findAllCourse();
        model.addAttribute("courseList",courseList);
        model.addAttribute("idStudent", id);
        return "Student-Enrollment";
    }

    @RequestMapping("/processEnrollment")
    public String dataProcessEnrollment(@RequestParam String idStudent,
                                        @RequestParam String payment,
                                        @RequestParam String period,
                                        @RequestParam List<String> idCourse){

        Student student = this.studentServe.findById(Integer.parseInt(idStudent));
        for (String s : idCourse) {
            Course course = this.courseServe.findById(Integer.parseInt(s));
            Enrollment enrollment = new Enrollment();
            enrollment.setStudentId(student);
            enrollment.setPeriod(period);
            enrollment.setPaymentMethod(payment);
            enrollment.setEnrollmentDate(LocalDate.now());
            enrollment.setCourseId(course);

            this.enrollmentServe.save(enrollment);

        }
        return "redirect:/dataEnrollment";
    }

    @RequestMapping("/dataEnrollment")
    public String dataEnrollment(Model model){
        List<Enrollment> enrollmentList = this.enrollmentServe.findAllEnrollment();

        List<String[]> allEnrollment = new ArrayList<>();

        for (Enrollment enrollment: enrollmentList) {
            String[] strings = {
                    String.valueOf(enrollment.getStudentId().getId()),
                    enrollment.getStudentId().getFirstName(),
                    enrollment.getStudentId().getLastName(),
                    enrollment.getStudentId().getJenisKelamin(),
                    enrollment.getEnrollmentDate().toString(),
                    enrollment.getPaymentMethod(),
                    enrollment.getPeriod(),
                    enrollment.getCourseId().getTitle(),
            };
            allEnrollment.add(strings);
        }
        model.addAttribute("allEnrollment",allEnrollment);
        return "Student-Enrolled";
    }

}
