package algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciLastDigitSumTest {
    FibonacciLastDigitSum digit = new FibonacciLastDigitSum();

    @Test
    public void testSmallNumber() {
        assertEquals(4, digit.findLastDigit(3));
        assertEquals(7, digit.findLastDigit(4));
    }

    @Test
    public void testMidNumber() {
        assertEquals(5, digit.findLastDigit(100));
    }

    @Test
    public void testBigNumber() {
        assertEquals(3, digit.findLastDigit(832564823476l));
    }
}
