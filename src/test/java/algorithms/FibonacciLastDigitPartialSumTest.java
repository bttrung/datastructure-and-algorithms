package algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciLastDigitPartialSumTest {
    FibonacciLastDigitPartialSum digit = new FibonacciLastDigitPartialSum();

    @Test
    public void testSmallNumber() {
        assertEquals(1, digit.findLastDigit(3, 7));
    }

    @Test
    public void testSmallNumber2() {
        assertEquals(5, digit.findLastDigit(10, 10));
    }

    @Test
    public void testMidNumber() {
        assertEquals(2, digit.findLastDigit(10, 200));
    }

    @Test
    public void testMidNumber2() {
        assertEquals(8, digit.findLastDigit(1234, 12345));
    }


    @Test
    public void testBigNumber() {
        assertEquals(6, digit.findLastDigit(5618252, 6583591534156l));
    }

}
