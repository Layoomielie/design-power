package com.example.decorator.border;

/**
 * @author：张鸿建
 * @time：2019/6/28 20:39
 * @desc：
 **/
public class SiderBorder extends Border{
    private char borderchar;

    public SiderBorder(Display display, char borderchar) {
        super(display);
        this.borderchar = borderchar;
    }

    @Override
    public int getColumns() {
        return 1+display.getColumns()+1;
    }

    @Override
    public int getrow() {
        return display.getrow();
    }

    @Override
    public String getRowText(int row) {
        return borderchar+display.getRowText(row)+borderchar;
    }
}
