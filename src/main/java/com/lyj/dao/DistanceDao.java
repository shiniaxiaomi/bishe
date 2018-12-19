package com.lyj.dao;

import com.lyj.model.Distance;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by lyj80 on 2018/12/19.
 */

@Repository
public interface DistanceDao {

    @Select("select value,time from distance where time between #{start} and #{end} order by time asc")
    List<Distance> getDistances(@Param("start") Date start, @Param("end") Date end);

}
