package com.example.filter;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/14 16:00
 */

/**
 * @author：张鸿建
 * @time：2019/6/14
 * @desc：
 **/
public class Person {

    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String name,String gender,String maritalStatus){
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getMaritalStatus() {
        return maritalStatus;
    }

}
