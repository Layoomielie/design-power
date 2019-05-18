import com.example.prototype.Manager;
import com.example.prototype.MessageBox;
import com.example.prototype.Product;
import com.example.prototype.UnderlinePen;
import org.junit.Test;

/**
 * @author zhanghongjian
 * @Date 2019/5/18 13:57
 * @Description  为什么要用prototype 解耦框架与生成的实例  当不好根据类去创建实例时 可用到这个
 */
public class prototypeTest {


    @Test
    public void test(){
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
