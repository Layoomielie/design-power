package com.example.decorator.border;

/**
 * @author：张鸿建
 * @time：2019/6/28 20:27
 * @desc：
 **/
public abstract class Display {
    public abstract int getColumns();        //获取列长度
    public abstract int getrow();           //获取行长度
    public abstract String getRowText(int  row);    //获取第row行的字符串
    public final void show(){
        for (int i=0;i<getrow();i++){
            System.out.println(getRowText(i));
        }
    }
}
