package algorithms;

import org.junit.Test;

import java.math.BigInteger;

public class FibonacciTest {

    @Test
    public void testBadSolution() {
        Fibonacci fibonacci = new Fibonacci();
//        assertEquals(0, fibonacci.badSolution(0));
//        assertEquals(1, fibonacci.badSolution(1));
//        assertEquals(1, fibonacci.badSolution(2));
//        assertEquals(2, fibonacci.badSolution(3));
//        assertEquals(3, fibonacci.badSolution(4));
//        assertEquals(5, fibonacci.badSolution(5));
//        assertEquals(8, fibonacci.badSolution(6));
        long start = System.currentTimeMillis();
        int solution = fibonacci.badSolution(45);
        long end = System.currentTimeMillis();
        System.out.println("Result: " + solution + ", in " + (end - start) + " ms");
    }

    @Test
    public void testBetterSolution() {
        Fibonacci fibonacci = new Fibonacci();
        long start = System.currentTimeMillis();
        BigInteger solution = fibonacci.betterSolution(1000);
        long end = System.currentTimeMillis();
        System.out.println("Result: " + solution + ", in " + (end - start) + " ms");
    }
}
