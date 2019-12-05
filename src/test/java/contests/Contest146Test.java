package contests;

import org.junit.Assert;
import org.junit.Test;

public class Contest146Test {

    Contest146 contest = new Contest146();

    @Test
    public void test1() {
        int[][] domins = {{1,2},{2,1},{3,4},{4,6}};
        int result = contest.numEquivDominoPairs(domins);
        Assert.assertEquals(1, result);

    }

    @Test
    public void test2() {
        int[][] domins = {{1,2},{2,1},{3,4},{4,3}};
        int result = contest.numEquivDominoPairs(domins);
        Assert.assertEquals(2, result);

    }

    @Test
    public void test3() {
        int[][] domins = {{1,2},{2,1},{3,4},{3,4}};
        int result = contest.numEquivDominoPairs(domins);
        Assert.assertEquals(2, result);

    }

    @Test
    public void test4() {
        int[][] domins = {{1,1},{1,1}};
        int result = contest.numEquivDominoPairs(domins);
        Assert.assertEquals(1, result);

    }

    @Test
    public void test5() {
        int[][] domins = {{1,1}};
        int result = contest.numEquivDominoPairs(domins);
        Assert.assertEquals(0, result);

    }

    @Test
    public void test6() {
//        [[1,2],[1,2],[1,1],[1,2],[2,2]]
        int[][] domins = {{1,2}, {1, 2}, {1, 1}, {1, 2}, {2, 2}};
        int result = contest.numEquivDominoPairs(domins);
        Assert.assertEquals(3, result);

    }

    @Test
    public void test7() {
//        [[1,1],[2,2],[1,1],[1,2],[1,2],[1,1]]
        int[][] domins = {{1,1}, {2, 2}, {1, 1}, {1, 2}, {1, 2}, {1, 1}};
        int result = contest.numEquivDominoPairs(domins);
        Assert.assertEquals(4, result);

    }

}
