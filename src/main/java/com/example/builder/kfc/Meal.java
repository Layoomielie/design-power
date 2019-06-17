package com.example.builder.kfc;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/6 9:37
 */

import com.example.builder.kfc.pack.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @author：张鸿建
 * @time：2019/6/6
 * @desc：
 **/
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items
        ) {
            cost += item.price();
        }
        return cost;
    }
    public void showItems(){
        for (Item item : items) {
            System.out.println("Item "+item.name());
            System.out.println("Packing : "+item.packing().pack());
            System.out.println("Price : "+item.price());
        }
    }
}
