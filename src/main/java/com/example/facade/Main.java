package com.example.facade;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/14 17:44
 */

/**
 * @author：张鸿建
 * @time：2019/6/14
 * @desc：
 **/
public class Main {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
