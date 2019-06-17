package com.example.bridge;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/14 15:29
 */

/**
 * @author：张鸿建
 * @time：2019/6/14
 * @desc：
 **/
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
