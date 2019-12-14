package algorithms;

/**
 * Given an integer 𝑛, find the last digit of the sum 𝐹0 +𝐹1 +···+𝐹𝑛.
 */
public class FibonacciLastDigitSum {

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


    public long findLastDigit(long n) {
        long result = 0;

        long period = calculatePeriod(10);

        n = n % period;

        for (long i = 0; i <= n; i++) {
            long rs = calculateHugeFibonacci(i, 10, period);
            System.out.println("i=" + i + ", rs=" + rs);
            result += rs;
            result = result % 10;
        }
        return result;
    }
}
