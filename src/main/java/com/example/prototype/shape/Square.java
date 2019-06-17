package com.example.prototype.shape;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/14 11:21
 */

/**
 * @author：张鸿建
 * @time：2019/6/14
 * @desc：
 **/
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
