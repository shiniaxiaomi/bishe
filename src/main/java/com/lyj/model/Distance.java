package com.lyj.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * Created by 陆英杰
 * 2018/12/19 23:21
 */

@NoArgsConstructor(force = true) //生成无参构造方法
@Getter //让lombok自动生成getset方法和无参构造方法
@Setter
public class Distance {

    private int id;
    private float value;
    private Date time;

}
