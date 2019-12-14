package algorithms;

import java.math.BigInteger;

/**
 * Given two integers 𝑛 and 𝑚, output 𝐹𝑛 mod 𝑚 (that is, the remainder of 𝐹𝑛 when divided by 𝑚)
 * <p>
 * 1≤𝑛≤10^14 ,2≤𝑚≤10^3
 * <p>
 * Output 𝐹𝑛 mod 𝑚
 * <p>
 * Sample 1.
 * Input:
 * 239 1000
 * Output:
 * 161
 * <p>
 * Sample 2.
 * Input:
 * 2816213588 239
 * Output:
 * 151
 */
public class FibonacciHuge {

    // Pisano period
    public long calculatePeriod(long m) {

        long previous = 0;
        long current = 1;

        long result = 0;

        for (int i = 0; i < m * m; i++) {
            long curr = previous + current;
            previous = current;
            current = curr % m;

            if (previous == 0 && current == 1) {
                result = i + 1;
                break;
            }
        }

        return result;
    }

    public long calculateHugeFibonacci(long n, int m) {
        long period = calculatePeriod(m);

        long remainder = n % period;
        long result = remainder;

        long first = 0;
        long second = 1;

        for (int i = 1; i < remainder; i++) {
            result = (first + second) % m;
            first = second;
            second = result;
        }

        return result % m;
    }


}
