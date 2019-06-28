package com.example.decorator.border;

/**
 * @author：张鸿建
 * @time：2019/6/28 20:44
 * @desc：
 **/
public class FullBorder extends Border{
    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return 1+display.getColumns()+1;
    }

    @Override
    public int getrow() {
        return 1+display.getrow()+1;
    }

    @Override
    public String getRowText(int row) {
        if(row==0){
            return "+"+makeLine('-',display.getColumns())+"+";
        }else if(row==display.getrow()+1){
            return "+"+makeLine('-',display.getColumns())+"+";
        }else {
            return "|"+display.getRowText(row-1)+"|";
        }
    }

    private String makeLine(char ch,int count){
        StringBuffer buffer = new StringBuffer();
        for (int i=0;i<count;i++){
            buffer.append(ch);
        }
        return buffer.toString();
    }
}
