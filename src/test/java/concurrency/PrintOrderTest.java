package concurrency;

import org.junit.Test;

public class PrintOrderTest {

    @Test
    public void testOrder() throws InterruptedException {
        PrintOrder order = new PrintOrder();
        order.first(() -> System.out.println("first"));
        order.third(() -> System.out.println("third"));
        order.second(() -> System.out.println("second"));
    }

}
