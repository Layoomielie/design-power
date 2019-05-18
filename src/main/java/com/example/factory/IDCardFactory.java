package com.example.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhanghongjian
 * @Date 2019/5/18 10:38
 * @Description
 */
public class IDCardFactory extends Factory{

    private List list=new ArrayList<Product>();
    private int code=1000;

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner,code++);
    }

    @Override
    protected void registerProduct(Product product) {
        list.add(product);
    }

    public List getOwners(){
        return list;
    }
}
