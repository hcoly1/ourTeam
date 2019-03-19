package com.ourTeam.portal.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hcoly1
 * @create 2019-03-06-19:01
 */
@Controller
public class PageController {
    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }

    @RequestMapping("/courses")
    public String showCourses(){ return "courses";}
}
