package com.example.chain;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/15 10:42
 */

/**
 * @author：张鸿建
 * @time：2019/6/15
 * @desc：
 **/
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
