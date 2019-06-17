package com.example.abstractFactory;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/5 20:38
 */

import com.example.abstractFactory.shape.Shape;

/**
 * @author：张鸿建
 * @time：2019/6/5
 * @desc：    通过一个超级工厂去创建其他工厂，适用于创建一个系列的东西
 **/
public class Main {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
    }
}
