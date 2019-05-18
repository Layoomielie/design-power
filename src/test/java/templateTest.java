import com.example.template.AbstractDisplay;
import com.example.template.CharDisplay;
import com.example.template.StringDisplay;
import org.junit.Test;

import java.io.InputStream;

/**
 * @author zhanghongjian
 * @Date 2019/5/18 9:44
 * @Description
 */
public class templateTest {

    @Test
    public void test(){
        AbstractDisplay h = new CharDisplay('h');
        StringDisplay s = new StringDisplay("Hello world");
        h.display();
        s.display();
    }
}
