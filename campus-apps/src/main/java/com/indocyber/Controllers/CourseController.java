package com.indocyber.Controllers;

import com.indocyber.Entities.Course;
import com.indocyber.Services.Implements.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseServe;

    @RequestMapping("/Register3")
    public String register3(Model model){
        Course course = new Course();
        model.addAttribute("course",course);
        return "Register3";
    }

    @RequestMapping("/processCourse")
    public String dataCourseprocess(@ModelAttribute("course") Course course){
        this.courseServe.save(course);
        return "redirect:/course/dataCourse" ;
    }

    @RequestMapping("/editCourse/{id}")
    public String editCourse(@PathVariable("id") int id, Model model) {
        Course course = this.courseServe.findById(id);
        model.addAttribute("course", course);
        return "Edit-Course";
    }

    @RequestMapping("/deleteCourse/{id}")
    public String deleteCourse(@PathVariable("id") int id) {
        Course course = this.courseServe.findById(id);
        System.out.println(course.getId());
        this.courseServe.delete(course);

        return "redirect:/dataCourse";
    }
    @RequestMapping("/updateCourse")
    public String updateCourse(@ModelAttribute("course") Course course) {
        this.courseServe.save(course);
        return "redirect:/course/dataCourse";
    }

    @RequestMapping("/dataCourse")
    public String dataCourse(Model model){
        List<Course> courseList = this.courseServe.findAllCourse();
        model.addAttribute("courseList",courseList);
        return "Courses";
    }

}
