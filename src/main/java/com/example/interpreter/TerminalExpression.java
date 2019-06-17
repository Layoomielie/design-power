package com.example.interpreter;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/15 13:57
 */

/**
 * @author：张鸿建
 * @time：2019/6/15
 * @desc：
 **/
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }


    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
