
import com.example.singleton.TicketMarker;
import org.junit.Test;

/**
 * @author zhanghongjian
 * @Date 2019/5/18 11:11
 * @Description
 */
public class simletonTest {

    @Test
    public void test(){
        TicketMarker instance1 = TicketMarker.getInstance(1);
        TicketMarker instance2 = TicketMarker.getInstance(2);
        System.out.println(instance1.getTicket());
        System.out.println(instance1.getTicket());
        System.out.println(instance2.getTicket());
        System.out.println(instance2.getTicket());
    }
}
