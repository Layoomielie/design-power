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
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
