package com.example.decorator.border;

/**
 * @author：张鸿建
 * @time：2019/6/28 20:48
 * @desc：
 **/
public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("hello world");
        b1.show();
        Display b2 = new SiderBorder(b1,'*');
        b2.show();
        Display b3 = new FullBorder(b2);
        b3.show();
    }
}
