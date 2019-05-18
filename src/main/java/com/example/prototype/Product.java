package com.example.prototype;

/**
 * @author zhanghongjian
 * @Date 2019/5/18 13:39
 * @Description
 */
public interface Product extends  Cloneable{
    public abstract void use(String name);
    public abstract Product createClone();
}
