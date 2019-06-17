package com.example.proxy;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/14 20:30
 */

/**
 * @author：张鸿建
 * @time：2019/6/14
 * @desc：
 **/
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }


    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
