package com.example.chain;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/15 10:43
 */

/**
 * @author：张鸿建
 * @time：2019/6/15
 * @desc：
 **/
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
