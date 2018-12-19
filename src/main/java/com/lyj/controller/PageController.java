package com.lyj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Yingjie.Lu on 2018/10/7.
 */

@Controller
@RequestMapping("bishe")
public class PageController {

    @RequestMapping("/home")
    public ModelAndView home(ModelAndView mv){
        mv.setViewName("home");
        return mv;
    }

    @RequestMapping("/turnDetection")
    public ModelAndView turnDetection(ModelAndView mv){
        mv.setViewName("turnDetection");
        return mv;
    }
//
//    @RequestMapping("/folderManager")
//    public ModelAndView urlManager(ModelAndView mv){
//        mv.setViewName("folderManager");
//        return mv;
//    }





}
