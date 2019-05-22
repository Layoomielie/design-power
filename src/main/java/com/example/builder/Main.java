package com.example.builder;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/5/22 20:55
 */

/**
 * @author：张鸿建
 * @time：2019/5/22
 * @desc：
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
