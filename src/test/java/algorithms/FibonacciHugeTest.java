package algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciHugeTest {

    FibonacciHuge fibonacciHuge = new FibonacciHuge();

    @Test
    public void testPisanoPeriod() {
        assertEquals(8, fibonacciHuge.calculatePeriod(3));
        assertEquals(20, fibonacciHuge.calculatePeriod(5));
        assertEquals(300, fibonacciHuge.calculatePeriod(100));
        assertEquals(160, fibonacciHuge.calculatePeriod(235));
    }


    @Test
    public void testModSmallNumber() {
        assertEquals(1, fibonacciHuge.calculateHugeFibonacci(2015, 3));
        assertEquals(1, fibonacciHuge.calculateHugeFibonacci(2019, 5));
    }

    @Test
    public void testModMidNumber() {
        assertEquals(161, fibonacciHuge.calculateHugeFibonacci(239, 1000));
    }

    @Test
    public void testModBigNumber() {
        assertEquals(151, fibonacciHuge.calculateHugeFibonacci(2816213588L, 239));
    }
}
