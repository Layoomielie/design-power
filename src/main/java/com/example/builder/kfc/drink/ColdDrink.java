package com.example.builder.kfc.drink;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/6 9:27
 */

import com.example.builder.kfc.pack.Bottle;
import com.example.builder.kfc.pack.Item;
import com.example.builder.kfc.pack.Packing;

/**
 * @author：张鸿建
 * @time：2019/6/6
 * @desc：
 **/
public abstract class ColdDrink implements Item {

    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
