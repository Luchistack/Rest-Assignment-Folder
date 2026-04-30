package Order;

import org.testng.annotations.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderTest {

//    @BeforeEach
//    @Test
//    public void setUp(){
//        Order newOrder = new Order("orderId", "name");
//    }

    @Test
    public void testThatItemCanBeAdded(){

        Order newOrder = new Order("orderId", "name");

        newOrder.addItem("Rice", 2, BigDecimal.valueOf(1000));

        assertTrue(newOrder.addItem());
    }

}
