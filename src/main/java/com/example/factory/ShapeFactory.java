package com.example.factory;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/5 20:43
 */

import com.example.factory.shape.Circle;
import com.example.factory.shape.Rectangle;
import com.example.factory.shape.Shape;
import com.example.factory.shape.Square;

/**
 * @author：张鸿建
 * @time：2019/6/5
 * @desc：
 **/
public class ShapeFactory {

    public static Shape getShape(String shapeType){
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
