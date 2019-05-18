package com.example.adapter.classadapter;

/**
 * @author zhanghongjian
 * @Date 2019/5/17 20:06
 * @Description    相当于一个代理 对相同东西做不同的适应性处理
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String ban) {
        super(ban);
    }

    public void printweak() {
        showWithParen();
    }

    public void printStrong() {
        showWithAster();
    }


}
