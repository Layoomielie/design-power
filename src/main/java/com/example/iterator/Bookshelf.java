package com.example.iterator;

/**
 * @author zhanghongjian
 * @Date 2019/5/17 17:57
 * @Description
 */
public class Bookshelf implements MyAggregate {
    private Book[] books;
    private int last=0;

    public Bookshelf(int maxIndex) {
         this.books = new Book[maxIndex];
    }

    public void appendBook(Book book){
        this.books[last]=book;
        last++;
    }
    public Book getBook(int index){

        return books[index];

    }
    public int getLength(){
        return last;
    }

    public MyIterator myiterator() {
        return new BookShelflterator(this);
    }
}
