package com.example.builder;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/5/22 20:48
 */

/**
 * @author：张鸿建
 * @time：2019/5/22
 * @desc：
 **/
public class TextBuilder  extends Builder {

    public StringBuffer buffer=new StringBuffer();

    @Override
    public void makeTitle() {
        buffer.append("--------- Text Title ---------\n");
    }

    @Override
    public void makeString() {
        buffer.append("--------- Text String ---------\n");
    }

    @Override
    public void makeItem() {
        buffer.append("--------- Text MakeItem ---------\n");
    }

    @Override
    public void close() {
        buffer.append("--------- Text close ---------\n");
;    }

    public String getResult(){
       return buffer.toString();
    }
}
