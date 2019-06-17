package com.example.builder.kfc.burger;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/6 9:33
 */

/**
 * @author：张鸿建
 * @time：2019/6/6
 * @desc：
 **/
public class VegBurger extends Burger {

    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
