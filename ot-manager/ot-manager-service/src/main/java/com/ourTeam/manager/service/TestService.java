package com.ourTeam.manager.service;

import com.ourTeam.TestInterface;
import com.ourTeam.manager.dao.CourseInfoMapper;
import com.ourTeam.manager.pojo.CourseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("testService")
public class TestService implements TestInterface {

    @Autowired
    private CourseInfoMapper courseInfoMapper;

    @Override
    public CourseInfo getCourseInfo(Long id) {

        return courseInfoMapper.selectByPrimaryKey((long) id);
    }
}
