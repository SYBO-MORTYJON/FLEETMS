package com.napa.Hospital;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping("/index")
    public String home(){
        return "index";
    }

    @GetMapping("/widgets")
    public String widget(){
        return "widgets";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/_layout")
    public String layout(){
        return "_layout";
    }

    @GetMapping("/index2")
    public String index2(){
        return "index2";
    }

    @GetMapping("/hr")
    public String hr(){
        return "/hr/index";
    }

}
