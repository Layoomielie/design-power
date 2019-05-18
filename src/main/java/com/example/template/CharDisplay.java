package com.example.template;

/**
 * @author zhanghongjian
 * @Date 2019/5/18 9:35
 * @Description
 */
public class CharDisplay extends  AbstractDisplay{

    private char c;

    public CharDisplay(char c) {
        this.c = c;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(c);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
