package com.indocyber.Controllers;

import com.indocyber.Entities.Student;
import com.indocyber.Services.Implements.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentServe;

    @RequestMapping("/Register2")
    public String register2(Model model){
        Student student = new Student();
        model.addAttribute("student",student);
        return "Register2";
    }

    @RequestMapping("/processStudent")
    public String dataStudentProcess(@ModelAttribute("student")Student student){
        this.studentServe.save(student);

        return "redirect:/dataStudent";
    }

    @RequestMapping("/editStudent/{id}")
    public String editStudent(@PathVariable("id") int id, Model model) {
        Student student = this.studentServe.findById(id);
        model.addAttribute("student", student);
        return "Edit-Student";
    }

    @RequestMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable("id") int id) {
        Student student = this.studentServe.findById(id);
        System.out.println(student.getId());
        this.studentServe.delete(student);

        return "redirect:/dataStudent";
    }

    @RequestMapping("/updateStudent")
    public String updateStudent(@ModelAttribute("student") Student student) {
        this.studentServe.save(student);
        return "redirect:/dataStudent";
    }

    @RequestMapping("/dataStudent")
    public String studentBiodata(Model model){
        List<Student> studentList = this.studentServe.findAllStudent();
        model.addAttribute("studentList",studentList);

        return "Student-Biodata";
    }

}
