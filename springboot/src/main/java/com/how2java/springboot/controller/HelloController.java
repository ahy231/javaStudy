package com.how2java.springboot.controller;
import java.text.DateFormat;
import java.util.Date;

import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController extends SpringBootServletInitializer {

    @RequestMapping("/hello")
    public String hello(Model m) throws Exception {
        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        throw new Exception();
//        return "hello";
    }
}