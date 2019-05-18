package com.example.factory;

/**
 * @author zhanghongjian
 * @Date 2019/5/18 10:36
 * @Description
 */
public class IDCard extends Product{

    private String owner;
    private int idCode;

    public IDCard(String owner,int idCode) {
        System.out.println("正在制作"+owner+"的信用卡 编号为"+idCode);
        this.owner = owner;
        this.idCode=idCode;
    }

    @Override
    public void use() {
        System.out.println("使用"+owner+"的信用卡 编号为"+idCode);
    }

    public String getOwner(){
         return owner;
    }
}
