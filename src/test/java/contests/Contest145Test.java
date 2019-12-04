package contests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Contest145Test {

    Contest145 contest = new Contest145();

    @Test
    public void test1() {
        int[] hours = {9,9,6,5,8,8,8};
        int longestWPI = contest.longestWPI(hours);
        assertEquals(3, longestWPI);
    }

    @Test
    public void test2() {
        int[] hours = {9,8,6,5,9,9,9};
        int longestWPI = contest.longestWPI(hours);
        assertEquals(3, longestWPI);
    }

    @Test
    public void test3() {
        int[] hours = {9,9,9};
        int longestWPI = contest.longestWPI(hours);
        assertEquals(3, longestWPI);
    }

    @Test
    public void test4() {
        int[] hours = {6, 6, 6};
        int longestWPI = contest.longestWPI(hours);
        assertEquals(0, longestWPI);
    }

    @Test
    public void test5() {
        int[] hours = {6, 6, 9};
        int longestWPI = contest.longestWPI(hours);
        assertEquals(1, longestWPI);
    }


    @Test
    public void test6() {
        int[] hours = {6, 9, 6};
        int longestWPI = contest.longestWPI(hours);
        assertEquals(1, longestWPI);
    }

    @Test
    public void test7() {
        int[] hours = {9, 6, 9};
        int longestWPI = contest.longestWPI(hours);
        assertEquals(3, longestWPI);
    }
}
