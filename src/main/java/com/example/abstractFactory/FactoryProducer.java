package com.example.abstractFactory;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/5 20:35
 */

/**
 * @author：张鸿建
 * @time：2019/6/5
 * @desc：   获取
 **/
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
