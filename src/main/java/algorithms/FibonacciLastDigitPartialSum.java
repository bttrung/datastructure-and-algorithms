package algorithms;

/**
 * Given two non-negative integers 𝑚 and 𝑛, where 𝑚 ≤ 𝑛, find the last digit of the sum 𝐹𝑚 + 𝐹𝑚+1 + ···+𝐹𝑛
 */
public class FibonacciLastDigitPartialSum {

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

    public long calculateHugeFibonacci(long n, int m, long period) {

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


    public long findLastDigit(long m, long n) {
        long result = 0;

        long period = calculatePeriod(10);

        m = m % period;
        n = n % period;

        if (n < m) {
            n = n + period;
        }

        for (long i = m; i <= n; i++) {
            long rs = calculateHugeFibonacci(i, 10, period);
            result += rs;
            result = result % 10;
        }
        return result;
    }
}
