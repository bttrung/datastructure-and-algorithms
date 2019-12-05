package algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * Maximum Pairwise Product Problem
 * Find the maximum product of two distinct num- bers in a sequence of non-negative integers.
 * Input: A sequence of non-negative integers.
 * Output: The maximum value that can be obtained by multiplying two different elements from the se- quence.
 */
public class MaxPairwiseProduct {


    static BigInteger getMaxPairwiseProductFast(int[] numbers) {
        System.out.println("--- fast ---");
        int max = 0;
        int index1 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                index1 = i;
                max = numbers[i];
            }
        }

        int second = 0;
        int index2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i != index1) {
                if (numbers[i] > second) {
                    index2 = i;
                    second = numbers[i];
                }
                second = Math.max(second, numbers[i]);
            }
        }

        System.out.println("max: " + max + ", second: " + second);
        System.out.println("index1: " + index1 + ", index2: " + index2);
        return new BigInteger(String.valueOf(max)).multiply(new BigInteger(String.valueOf(second)));
    }

//    static BigInteger getMaxPairwiseProduct(int[] numbers) {
//        System.out.println("--- normal ---");
//        BigInteger max_product = BigInteger.ZERO;
//        int n = numbers.length;
//
//        int index1 = 0;
//        int index2 = 0;
//
//        int max = 0;
//        int secd = 0;
//
//        for (int first = 0; first < n; ++first) {
//            for (int second = first + 1; second < n; ++second) {
////                if (numbers[first] != numbers[second]) {
//                BigInteger newMax = new BigInteger(String.valueOf(numbers[first])).multiply(new BigInteger(String.valueOf(numbers[second])));
//                if (newMax.compareTo(max_product) > 0) {
//                    max_product = newMax;
//                    index1 = first;
//                    index2 = second;
//                    max = numbers[first];
//                    secd = numbers[second];
//                }
////                }
//            }
//        }
//
//        System.out.println("max: " + max + ", second: " + secd);
//        System.out.println("index1: " + index1 + ", index2: " + index2);
//        return max_product;
//    }


    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProductFast(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                        InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}
