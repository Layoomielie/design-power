package com.example.bridge;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/14 15:15
 */

/**
 * @author：张鸿建
 * @time：2019/6/14
 * @desc：
 **/

public class RedCircle implements DrawAPI {


    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }

}