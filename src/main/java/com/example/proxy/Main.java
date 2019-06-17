package com.example.proxy;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/14 20:33
 */

/**
 * @author：张鸿建
 * @time：2019/6/14
 * @desc：
 **/
public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
