package com.example.interpreter;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/15 13:58
 */

/**
 * @author：张鸿建
 * @time：2019/6/15
 * @desc：
 **/
public class AndExpression implements Expression {

    private Expression expr1 = null;
    private Expression expr2 = null;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }


    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
