package com.example.template;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        CharDisplay charDisplay = new CharDisplay('H');
        StringDisplay stringDisplay1 = new StringDisplay("hello world");
        StringDisplay stringDisplay2 = new StringDisplay("你好  世界");
        charDisplay.display();
        stringDisplay1.display();
        stringDisplay2.display();


    }
}
