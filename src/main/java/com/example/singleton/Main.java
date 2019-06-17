package com.example.singleton;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/5 20:49
 */

/**
 * @author：张鸿建
 * @time：2019/6/5
 * @desc：   单例 或 多例模式  因为构造函数为private 所以不能new对象  懒汉模式线程不安全，饿汉模式线程安全
 **/
public class Main {
    public static void main(String[] args) {
        TicketMarker instance1 = TicketMarker.getInstance(0);
        int ticket1 = instance1.getTicket();
        int ticket2 = instance1.getTicket();
        System.out.println(ticket1);
        System.out.println(ticket2);
        TicketMarker instance2 = TicketMarker.getInstance(1);
        int ticket3 = instance2.getTicket();
        System.out.println(ticket3);
    }
}
