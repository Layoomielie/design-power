package com.example.factory;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/5 20:46
 */

import com.example.factory.shape.Shape;

/**
 * @author：张鸿建
 * @time：2019/6/5
 * @desc：   单一的工厂模式
 **/
public class Main {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("CIRCLE");
        circle.draw();
    }
}
