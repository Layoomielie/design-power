package com.example.flyweight;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/14 20:15
 */

/**
 * @author：张鸿建
 * @time：2019/6/14
 * @desc：
 **/
public class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color){
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color
                +", x : " + x +", y :" + y +", radius :" + radius);
    }
}