package com.example.builder;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/5/22 20:55
 */

/**
 * @author：张鸿建
 * @time：2019/5/22
 * @desc： 通过同样的构建过程有不同的表示  与工厂模式的区别的是 ，构造者模式更关注零件的装配顺序
 **/
public class Main {
    public static void main(String[] args) {
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.conStruct();
        String result = textBuilder.getResult();
        System.out.println(result);
    }
}
