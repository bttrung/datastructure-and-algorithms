package algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciLastDigitSumSquaresTest {
    FibonacciLastDigitSumSquares digit = new FibonacciLastDigitSumSquares();

    @Test
    public void testSmallNumber1() {
        assertEquals(0, digit.findLastDigitSumSquares(5));
    }

    @Test
    public void testSmallNumber2() {
        assertEquals(3, digit.findLastDigitSumSquares(7));
    }

    @Test
    public void testMidNumber() {
        assertEquals(0, digit.findLastDigitSumSquares(1234567890));
    }

//    @Test
//    public void testBigNumber() {
//        assertEquals(3, digit.findLastDigitSumSquares(1234567890));
//    }
}
