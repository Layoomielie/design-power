package com.example.command;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/15 11:29
 */

/**
 * @author：张鸿建
 * @time：2019/6/15
 * @desc：
 **/
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
