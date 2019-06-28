package com.example.decorator.border;

/**
 * @author：张鸿建
 * @time：2019/6/28 20:34
 * @desc：
 **/
public class StringDisplay extends Display {
    private String str;

    public StringDisplay(String str) {
        this.str = str;
    }

    @Override
    public int getColumns() {
        return str.getBytes().length;
    }

    @Override
    public int getrow() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        if(row==0){
            return str;
        }else {
            return null;
        }
    }
}
