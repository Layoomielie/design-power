package com.example.mediator;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/15 14:37
 */

/**
 * @author：张鸿建
 * @time：2019/6/15
 * @desc：
 **/
public class Main {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
