package com.example.factory;

/**
 * @author zhanghongjian
 * @Date 2019/5/18 10:33
 * @Description
 */
public abstract class Factory {
    public final Product create(String owner){
       return createProduct(owner);
    }

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);
}
