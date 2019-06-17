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
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
