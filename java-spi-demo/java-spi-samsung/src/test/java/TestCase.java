import com.orc.spi.IMobilePhone;
import com.sun.tools.javac.util.ServiceLoader;
import java.util.Iterator;
import org.junit.jupiter.api.Test;

/**
 * TODO 添加类的描述
 *
 * @author lihui
 * @version 1.0, 2021/6/17 15:44
 */
public class TestCase {

    @Test
    public void test(){
        ServiceLoader<IMobilePhone> services = ServiceLoader.load(IMobilePhone.class);
        Iterator<IMobilePhone> iterator = services.iterator();
        while (iterator.hasNext()) {
            IMobilePhone mobilePhone = iterator.next();
            mobilePhone.call("110");
        }
    }
}
