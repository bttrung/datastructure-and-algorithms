package algorithms;

/**
 * Given an integer 𝑛, Compute the last digit of 𝐹0 +𝐹1 +···+𝐹𝑛
 */
public class FibonacciLastDigitSumSquares {

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


    public long findLastDigitSumSquares(long n) {
        long result = 0;

        long period = calculatePeriod(10);

        n = n % period;
        long lastN = calculateHugeFibonacci(n, 10, period);
        long lastNminus1 = calculateHugeFibonacci(n - 1, 10, period);

        result = lastN * ((lastNminus1 + lastN) % 10);


        return result % 10;
    }
}



