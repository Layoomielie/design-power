package com.example.decorator;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/14 17:22
 */

/**
 * @author：张鸿建
 * @time：2019/6/14
 * @desc：
 **/
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
