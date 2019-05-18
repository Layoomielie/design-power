import com.example.iterator.Book;
import com.example.iterator.Bookshelf;
import com.example.iterator.MyIterator;
import org.junit.Test;

/**
 * @author zhanghongjian
 * @Date 2019/5/17 19:03
 * @Description
 */
public class IteratorTest {

    @Test
    public void BookTest(){
        Bookshelf bookshelf = new Bookshelf(4);
        bookshelf.appendBook(new Book("Java"));
        bookshelf.appendBook(new Book("Python"));
        bookshelf.appendBook(new Book("Linux"));
        MyIterator myiterator = bookshelf.myiterator();
        while (myiterator.hasNext()){
            Object next = myiterator.next();
            System.out.println(next.toString());
        }
    }

}
