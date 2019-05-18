package com.example.prototype;

/**
 * @author zhanghongjian
 * @Date 2019/5/18 13:45
 * @Description
 */
public class MessageBox implements Product{
    private char c;

    public MessageBox(char c) {
        this.c = c;
    }

    public void use(String s) {
        int length = s.getBytes().length;
        for (int i = 0; i < length+4; i++) {
            System.out.print(c);
        }
        System.out.println("");
        System.out.println(c+" "+s+" "+c);
        for (int i = 0; i < length+4; i++) {
            System.out.print(c);
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
