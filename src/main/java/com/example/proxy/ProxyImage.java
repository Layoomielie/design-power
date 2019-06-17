package com.example.proxy;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/14 20:32
 */

/**
 * @author：张鸿建
 * @time：2019/6/14
 * @desc：
 **/
public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }


    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
