package com.indocyber.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("/index")
    public String home(){
        return "Home";
    }

    @RequestMapping("/access-denied")
    public String accessDenied(){

        return "Access-Denied";
    }
}
