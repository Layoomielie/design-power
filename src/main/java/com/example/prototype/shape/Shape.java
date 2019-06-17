package com.example.prototype.shape;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/14 11:17
 */

/**
 * @author：张鸿建
 * @time：2019/6/14
 * @desc：
 **/
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    abstract void draw();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
