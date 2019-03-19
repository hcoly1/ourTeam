package com.ourTeam.search.pojo;

import com.ourTeam.manager.pojo.CourseInfo;

import java.util.List;

/**
 * @author hcoly1
 * @create 2019-03-12-10:22
 */
public class SearchResult {
    private List<CourseInfo> courseInfoList;
    private Long total;

    public List<CourseInfo> getCourseInfoList() {
        return courseInfoList;
    }

    public void setCourseInfoList(List<CourseInfo> courseInfoList) {
        this.courseInfoList = courseInfoList;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
