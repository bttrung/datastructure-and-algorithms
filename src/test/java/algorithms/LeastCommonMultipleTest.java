package algorithms;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class LeastCommonMultipleTest {

    LeastCommonMultiple multiple = new LeastCommonMultiple();

    @Test
    public void testSmallNumber() {
        BigInteger leastCommon = multiple.findLeastCommon(6, 8);
        assertEquals("24", leastCommon.toString());
    }


    @Test
    public void testMidNumber() {
        BigInteger leastCommon = multiple.findLeastCommon(100, 125);
        assertEquals("500", leastCommon.toString());
    }

    @Test
    public void testBigNumber() {
        BigInteger leastCommon = multiple.findLeastCommon(761457, 614573);
        assertEquals("467970912861", leastCommon.toString());
    }
}
