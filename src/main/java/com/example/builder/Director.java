package com.example.builder;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/5/22 20:52
 */

/**
 * @author：张鸿建
 * @time：2019/5/22
 * @desc：
 **/
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void conStruct(){
        builder.makeTitle();
        builder.makeString();
        builder.makeItem();
        builder.close();

    }
}
