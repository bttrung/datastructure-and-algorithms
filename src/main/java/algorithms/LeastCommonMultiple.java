package algorithms;

import java.math.BigInteger;

/**
 * Given two integers 𝑎 and 𝑏, find their least common multiple
 * <p>
 * 1≤𝑎,𝑏≤10^7
 * <p>
 * Sample 1.
 * Input: 6 8
 * Output: 24
 * <p>
 * Sample 2.
 * Input: 761457 614573
 * Output: 467970912861
 */
public class LeastCommonMultiple {

    public BigInteger findLeastCommon(int a, int b) {

        int gcd = findGCD(a, b);
        return BigInteger.valueOf(a).divide(BigInteger.valueOf(gcd)).multiply(BigInteger.valueOf(b));
    }

    public int findGCD(int first, int second) {

        if (second == 0) {
            return first;
        }
        int remain = first % second;
        return findGCD(second, remain);
    }
}
