package com.example.adapter.classadapter;

/**
 * @author zhanghongjian
 * @Date 2019/5/17 19:57
 * @Description
 */
public class Banner {
    private String ban;
    public  Banner(String ban){
        this.ban=ban;
    }
    public void showWithParen(){
        System.out.println("("+ban+")");
    }
    public void showWithAster(){
        System.out.println("*"+ban+"*");
    }
}
