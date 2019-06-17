package com.example.prototype.shape;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/14 11:18
 */

/**
 * @author：张鸿建
 * @time：2019/6/14
 * @desc：
 **/
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
