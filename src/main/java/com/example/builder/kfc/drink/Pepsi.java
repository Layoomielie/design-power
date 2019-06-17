package com.example.builder.kfc.drink;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/6 9:36
 */

/**
 * @author：张鸿建
 * @time：2019/6/6
 * @desc：
 **/
public class Pepsi extends  ColdDrink{
    @Override
    public float price() {
        return 12.2f;
    }

    public String name() {
        return "Pepsi";
    }
}
