package com.example.iterator;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/15 14:24
 */

/**
 * @author：张鸿建
 * @time：2019/6/15
 * @desc：
 **/
public class Main {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf(10);
        bookshelf.appendBook(new Book("三国"));
        bookshelf.appendBook(new Book("袁绍"));
        bookshelf.appendBook(new Book("曹操"));
        bookshelf.appendBook(new Book("飞机"));
        bookshelf.appendBook(new Book("大炮"));
        MyIterator iterator = bookshelf.myiterator();
        while (iterator.hasNext()) {
            System.out.println(
                    iterator.next().toString());
        }

    }
}
