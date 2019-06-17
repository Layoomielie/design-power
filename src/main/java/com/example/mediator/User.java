package com.example.mediator;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/15 14:37
 */

/**
 * @author：张鸿建
 * @time：2019/6/15
 * @desc：
 **/
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
