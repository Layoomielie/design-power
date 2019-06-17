package com.example.decorator;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/14 17:23
 */

/**
 * @author：张鸿建
 * @time：2019/6/14
 * @desc：
 **/
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
