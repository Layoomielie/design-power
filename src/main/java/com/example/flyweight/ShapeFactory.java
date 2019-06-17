package com.example.flyweight;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/14 20:15
 */

import java.util.HashMap;

/**
 * @author：张鸿建
 * @time：2019/6/14
 * @desc：
 **/
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<String, Shape>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
