package com.lyj.service;

import com.lyj.dao.DistanceDao;
import com.lyj.model.Distance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by 陆英杰
 * 2018/12/19 23:34
 */

@Service
public class DistanceService {

    @Autowired
    DistanceDao distanceDao;



    public List<Distance> selectDataByTime(Date start, Date end){
        return distanceDao.getDistances(start, end);
    }

}
