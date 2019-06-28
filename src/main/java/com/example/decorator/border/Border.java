package com.example.decorator.border;

/**
 * @author：张鸿建
 * @time：2019/6/28 20:38
 * @desc：
 **/
public abstract class Border  extends Display{

    protected Display display;

    public Border(Display display) {
        this.display = display;
    }
}
