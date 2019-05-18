package com.example.template;

/**
 * @author zhanghongjian
 * @Date 2019/5/18 9:31
 * @Description   这样的好处是  在父类抽象类中定义算法，可以被多个继承类使用，而当出现bug时 只需要修改抽象类中的算法，模板中并不需要修改
 */
public abstract class AbstractDisplay {

    public abstract void open();
    public abstract void print();
    public abstract void close();

    public final void display(){
        open();
        for (int i=1;i<5;i++){
            print();
        }
        close();
    }
}
