package com.example.mediator;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/15 14:36
 */

import java.util.Date;

/**
 * @author：张鸿建
 * @time：2019/6/15
 * @desc：
 **/
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
