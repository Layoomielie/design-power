package com.example.command;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/15 11:30
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @author：张鸿建
 * @time：2019/6/15
 * @desc：
 **/
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
