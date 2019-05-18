package com.example.prototype;

import java.util.HashMap;

/**
 * @author zhanghongjian
 * @Date 2019/5/18 13:41
 * @Description
 */
public class Manager {

    private HashMap showcase=new HashMap();
    public void register(String name,Product product){
        showcase.put(name,product);
    }
    public Product create(String protoName){
        Product product = (Product)showcase.get(protoName);
        return product.createClone();
    }
}
