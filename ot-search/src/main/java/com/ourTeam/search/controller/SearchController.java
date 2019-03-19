package com.ourTeam.search.controller;

import com.ourTeam.common.pojo.CoursesResult;
import com.ourTeam.common.utlis.ExceptionUtil;
import com.ourTeam.search.pojo.SearchResult;
import com.ourTeam.search.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author hcoly1
 * @create 2019-03-12-10:57
 */
@Controller
public class SearchController {
    @Autowired
    private SearchService searchService;

    /**
     * 用于接收前台的搜索请求
     * @param keyword：搜索关键字
     * @param page：当前页面
     * @param rows：每页显示的行数
     * @return
     */
    @RequestMapping("/q")
    @ResponseBody
    public CoursesResult search(@RequestParam(defaultValue = "") String keyword,
                                @RequestParam(defaultValue = "1") Integer page,
                                @RequestParam(defaultValue = "10")Integer rows){

        try {
            SearchResult result = searchService.search(keyword, page, rows);
            return CoursesResult.ok(result);
        } catch (Exception e) {
            e.printStackTrace();
            return CoursesResult.build(500, ExceptionUtil.getStackTrace(e));
        }

    }
}
