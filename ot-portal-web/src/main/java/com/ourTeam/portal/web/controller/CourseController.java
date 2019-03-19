package com.ourTeam.portal.web.controller;

import com.ourTeam.TestInterface;
import com.ourTeam.manager.pojo.CourseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    private TestInterface testInterface;

    @RequestMapping("/index/{id}")
    @ResponseBody
    public CourseInfo test(@PathVariable Long id){

        CourseInfo courseInfo = testInterface.getCourseInfo(id);

        return courseInfo;
    }
}
