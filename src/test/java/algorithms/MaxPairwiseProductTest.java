package algorithms;

import org.junit.Test;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class MaxPairwiseProductTest {


    @Test
    public void testMinNumber() {
        int[] nums = {1, 2, 3};
        BigInteger product = MaxPairwiseProduct.getMaxPairwiseProductFast(nums);
        assertEquals(6, product);

    }

    @Test
    public void testMediumNumber() {
        int[] nums = {100000, 90000};
        BigInteger product = MaxPairwiseProduct.getMaxPairwiseProductFast(nums);
        assertEquals(new BigInteger("9000000000"), product);

    }

    @Test
    public void testBigNumber() {
        int[] nums = {68165, 87637, 74297, 2904, 32873, 86010, 87637, 66131, 82858, 82935};
        BigInteger product = MaxPairwiseProduct.getMaxPairwiseProductFast(nums);
        assertEquals(new BigInteger("7537658370"), product);

    }

    @Test
    public void testBigNumber2() {
        int[] nums = {};
        BigInteger product = MaxPairwiseProduct.getMaxPairwiseProductFast(nums);
        assertEquals(new BigInteger("7537658370"), product);

    }

//    @Test
//    public void stressTest() {
//        int from = 10;
////        int to = 100000;
//        int to = 100;
//
//        Random random = new Random();
//
//        while (true) {
//            System.out.println("\n");
//            int n = random.nextInt(to - from) + from;
//            System.out.println("n=" + n);
//
//            int[] nums = new int[n];
//            for (int i = 0; i < n; i++) {
//                nums[i] = random.nextInt(to);
//            }
//
//            System.out.println(Arrays.toString(nums));
//
//            BigInteger product1 = MaxPairwiseProduct.getMaxPairwiseProductFast(nums);
//            BigInteger product2 = MaxPairwiseProduct.getMaxPairwiseProduct(nums);
//
//            if (product1.equals(product2)) {
//                System.out.println("OK");
//            } else {
//                System.out.println("Failed: product1=" + product1 + ", product2=" + product2);
//                return;
//            }
//        }
//
//
//    }


    @Test
    public void stressTest() {
        int from = 10;
        int to = 10000000;

        Random random = new Random();

        System.out.println("\n");
        int n = random.nextInt(to - from) + from;
        System.out.println("n=" + n);

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = random.nextInt(to);
        }

        System.out.println(Arrays.toString(nums));

        long start = System.currentTimeMillis();
        BigInteger product1 = MaxPairwiseProduct.getMaxPairwiseProductFast(nums);
        long end = System.currentTimeMillis();
        System.out.println("Product: " + product1);
        System.out.println("Time in ms: " + (end - start));


    }

}
