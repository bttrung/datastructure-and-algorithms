package adventofcode;

/**
 * https://adventofcode.com/2019/day/1
 */

public class Day1P2 {

    public int calculateFuel(int input) {

        int round = (int) Math.floor(input / 3);
        int sum = round - 2;

        if (sum <= 0) {
            return 0;
        }

        return sum + calculateFuel(sum);
    }

}
