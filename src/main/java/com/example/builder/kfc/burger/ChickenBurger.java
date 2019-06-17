package com.example.builder.kfc.burger;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/6 9:34
 */

/**
 * @author：张鸿建
 * @time：2019/6/6
 * @desc：
 **/
public class ChickenBurger extends Burger{
    @Override
    public float price() {
        return 35f;
    }

    public String name() {
        return "Chicken Burger";
    }
}
