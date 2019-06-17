package com.example.prototype.shape;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/14 11:22
 */

/**
 * @author：张鸿建
 * @time：2019/6/14
 * @desc：
 **/
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}