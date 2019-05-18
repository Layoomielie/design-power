import com.example.factory.IDCardFactory;
import com.example.factory.Product;
import org.junit.Test;

/**
 * @author zhanghongjian
 * @Date 2019/5/18 10:41
 * @Description
 */
public class FactoryTest {


    @Test
    public void test(){
        IDCardFactory factory = new IDCardFactory();
        Product card1 = factory.create("ali");
        Product card2 = factory.create("taozi");
        Product card3 = factory.create("jiqimao");
        card1.use();
        card2.use();
        card3.use();
    }
}
