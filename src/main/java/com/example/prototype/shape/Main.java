package com.example.prototype.shape;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/14 11:25
 */

/**
 * @author：张鸿建
 * @time：2019/6/14
 * @desc：
 **/
public class Main {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
