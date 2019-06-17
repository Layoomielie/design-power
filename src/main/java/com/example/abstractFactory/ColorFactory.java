package com.example.abstractFactory;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/5 20:32
 */

import com.example.abstractFactory.color.Blue;
import com.example.abstractFactory.color.Color;
import com.example.abstractFactory.color.Green;
import com.example.abstractFactory.color.Red;
import com.example.abstractFactory.shape.Shape;

/**
 * @author：张鸿建
 * @time：2019/6/5
 * @desc：
 **/
public class ColorFactory extends AbstractFactory {


    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }


    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
