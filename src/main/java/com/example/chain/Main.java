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
public class Main {
    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

//        consoleLogger.setNextLogger(fileLogger);
//        fileLogger.setNextLogger(errorLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "这是 info 日志.");
        System.out.println();
        loggerChain.logMessage(AbstractLogger.DEBUG,
                "这是 debug 日志.");
        System.out.println();
        loggerChain.logMessage(AbstractLogger.ERROR,
                "这是 error 日志.");
    }
}
