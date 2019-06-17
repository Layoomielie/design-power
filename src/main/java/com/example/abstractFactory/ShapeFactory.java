package com.example.abstractFactory;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/5 20:34
 */

import com.example.abstractFactory.color.Color;
import com.example.abstractFactory.shape.Circle;
import com.example.abstractFactory.shape.Rectangle;
import com.example.abstractFactory.shape.Shape;
import com.example.abstractFactory.shape.Square;

/**
 * @author：张鸿建
 * @time：2019/6/5
 * @desc：
 **/
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
