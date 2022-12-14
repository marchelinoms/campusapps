package com.indocyber.Controllers;

import com.indocyber.Entities.Instructor;
import com.indocyber.Services.Implements.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/instructor")
public class InstructorController {
    @Autowired
    private InstructorService instructorServe;

    @RequestMapping("/Register")
    public String register(Model model){
        Instructor instructor = new Instructor();
        model.addAttribute("instructor",instructor);
        return "Register";
    }

    @RequestMapping("/processInstructor")
    public String dataInstructorProcess(@ModelAttribute("instructor")Instructor instructor){
        this.instructorServe.save(instructor);

        return "redirect:/dataInstructor";
    }

    @RequestMapping("/editInstructor/{id}")
    public String editInstructor(@PathVariable("id") int id, Model model) {
        Instructor instructor = this.instructorServe.findById(id);
        model.addAttribute("instructor", instructor);
        return "Edit-Instructor";
    }

    @RequestMapping("/deleteInstructor/{id}")
    public String deleteInstructor(@PathVariable("id") int id) {
        Instructor instructor = this.instructorServe.findById(id);
        this.instructorServe.delete(instructor);

        return "redirect:/dataInstructor";
    }
    @RequestMapping("/updateInstructor")
    public String updateInstructor(@ModelAttribute("instructor") Instructor instructor) {
        this.instructorServe.save(instructor);
        return "redirect:/dataInstructor";
    }

    @RequestMapping("/dataInstructor")
    public String instructorBiodata(Model model){
        List<Instructor> instructorList = this.instructorServe.findAllInstructor();
        model.addAttribute("instructorList",instructorList);

        return "Instructor-Biodata";
    }

}
