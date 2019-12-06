package algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreatestCommonDevisorsTest {

    @Test
    public void testEuclideanAlgorithms() {
        GreatestCommonDivisors divisors = new GreatestCommonDivisors();
        int result = divisors.euclideanAlgorithm(357, 234);
        assertEquals(3, result);

        int result2 = divisors.euclideanAlgorithm(3918848, 1653264);
        assertEquals(61232, result2);
    }
}
