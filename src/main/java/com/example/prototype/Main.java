package com.example.prototype;

public class Main {
    public static void main(String[] args) {
        MessageBox box = new MessageBox('*');
        UnderlinePen pen = new UnderlinePen('~');
        Manager manager = new Manager();
        manager.register("pen",pen);
        manager.register("box",box);
        pen.use("book");
        Product box1 = manager.create("pen");
        box1.use("take");
    }
}
