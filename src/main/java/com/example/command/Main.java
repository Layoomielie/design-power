package com.example.command;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/15 11:30
 */

/**
 * @author：张鸿建
 * @time：2019/6/15
 * @desc：
 **/
public class Main {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
