package com.example.builder.kfc.burger;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/6 9:31
 */

import com.example.builder.kfc.pack.Item;
import com.example.builder.kfc.pack.Packing;
import com.example.builder.kfc.pack.Wrapper;

/**
 * @author：张鸿建
 * @time：2019/6/6
 * @desc：
 **/
public abstract class Burger implements Item {


    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
