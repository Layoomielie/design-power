package com.example.adapter.objectadapter;

/**
 * @author zhanghongjian
 * @Date 2019/5/17 20:14
 * @Description  adapter  适配者
 */
public class PrintBanner extends Print{

    private Banner banner;

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
