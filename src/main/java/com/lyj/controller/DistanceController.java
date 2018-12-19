package com.lyj.controller;

import com.lyj.model.Distance;
import com.lyj.service.DistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * Created by 陆英杰
 * 2018/12/19 23:32
 */

@Controller
public class DistanceController {


    @Autowired
    DistanceService distanceService;


    @RequestMapping("/selectDataByTime")
    @ResponseBody
    public List<Distance> selectDataByTime(String start,String end){

        return distanceService.selectDataByTime(new Date(Long.valueOf(start)), new Date(Long.valueOf(end)));
    }

}
