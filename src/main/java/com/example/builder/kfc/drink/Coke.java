package com.example.builder.kfc.drink;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/6 9:35
 */

/**
 * @author：张鸿建
 * @time：2019/6/6
 * @desc：
 **/
public class Coke extends ColdDrink{
    @Override
    public float price() {
        return 10.0f;
    }

    public String name() {
        return "Coke";
    }
}
