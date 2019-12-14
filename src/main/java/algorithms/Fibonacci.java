package algorithms;

import java.math.BigInteger;

public class Fibonacci {

    public int badSolution(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return badSolution(n - 1) + badSolution(n - 2);
    }

    public BigInteger betterSolution(int n) {
        if (n == 0) {
            return BigInteger.ZERO;
        }

        if (n == 1) {
            return BigInteger.ONE;
        }

        BigInteger[] results = new BigInteger[n + 1];
        results[0] = BigInteger.ZERO;
        results[1] = BigInteger.ONE;


        for (int i = 2; i <= n; i++) {
            results[i] = results[i - 1].add(results[i - 2]);
        }

        return results[n];
    }
}
