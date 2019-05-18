package com.example.prototype;

/**
 * @author zhanghongjian
 * @Date 2019/5/18 13:45
 * @Description
 */
public class UnderlinePen implements Product{
    private char ulchar;

    public UnderlinePen(char c) {
        this.ulchar = c;
    }

    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\""+s+"\"");
        System.out.print("  ");
        for (int i = 0; i < length; i++) {
            System.out.println(ulchar);
        }
        System.out.println();
    }

    public Product createClone() {
        Product p=null;
        try {
            p=(Product)clone();
        }catch (Exception e){

        }
        return p;
    }
}
