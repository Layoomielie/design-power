package com.example.builder;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/5/22 20:46
 */

/**
 * @author：张鸿建
 * @time：2019/5/22
 * @desc：
 **/
public class HTMLBuilder extends Builder {

    public StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle() {
        buffer.append("--------- html Title ---------\n");
    }

    @Override
    public void makeString() {
        buffer.append("--------- html Title ---------\n");
    }

    @Override
    public void makeItem() {
        buffer.append("--------- html Title ---------\n");
    }

    @Override
    public void close() {
        buffer.append("--------- html Title ---------\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
