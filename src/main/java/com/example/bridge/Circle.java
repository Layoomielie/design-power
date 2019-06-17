package com.example.bridge;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/14 15:33
 */

/**
 * @author：张鸿建
 * @time：2019/6/14
 * @desc：
 **/
public class Circle extends Shape{
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
