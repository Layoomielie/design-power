package com.example.iterator;

/**
 * @author zhanghongjian
 * @Date 2019/5/17 18:59
 * @Description
 */
public class BookShelflterator implements MyIterator{
    private Bookshelf bookshelf;
    private int index;

    public BookShelflterator(Bookshelf bookshelf) {
        this.bookshelf = bookshelf;
        this.index=0;
    }

    public boolean hasNext() {
        if(index<bookshelf.getLength()){
            return true;
        }else {
            return false;
        }
    }

    public Object next() {
        Book book = bookshelf.getBook(index);
        index++;
        return book;
    }
}
