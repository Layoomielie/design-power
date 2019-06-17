package com.example.abstractFactory;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/5 20:26
 */

import com.example.abstractFactory.color.Color;
import com.example.abstractFactory.shape.Shape;

/**
 * @author：张鸿建
 * @time：2019/6/5
 * @desc：
 **/
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
