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
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
