package Spring1.SpringCoreBasic;

import Spring1.SpringCoreBasic.order.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringCoreBasicApplicationTests {

    @Autowired
    OrderService orderService;

    @Test
    void contextLoads() {
    }

}
