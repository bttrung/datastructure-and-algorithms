package adventofcode;

/**
 * https://adventofcode.com/2019/day/1
 */

public class Day1P1 {

    public int calculateFuel(int input) {

        int round = (int) Math.floor(input / 3);
        return round - 2;
    }

}
