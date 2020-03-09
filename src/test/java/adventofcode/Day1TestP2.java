package adventofcode;

import org.junit.Test;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Day1TestP2 {

    Day1P2  day1 = new Day1P2();

    @Test
    public void testFuel() {
        assertEquals(2, day1.calculateFuel(12));
        assertEquals(2, day1.calculateFuel(14));
        assertEquals(966, day1.calculateFuel(1969));
        assertEquals(50346, day1.calculateFuel(100756));
    }

    @Test
    public void testFuelSum() {

        BigInteger sum = BigInteger.ZERO;

        List<Integer> integers = Arrays.asList(82773,
                144167,
                64286,
                90060,
                139975,
                119911,
                147212,
                96993,
                118538,
                65995,
                70391,
                85639,
                124508,
                103982,
                86744,
                73303,
                72696,
                111316,
                98200,
                106212,
                128283,
                120601,
                101876,
                144647,
                110781,
                59689,
                110801,
                78142,
                123899,
                67801,
                61767,
                70819,
                88128,
                102947,
                73691,
                64806,
                79445,
                83799,
                146580,
                138268,
                72585,
                149134,
                137149,
                110634,
                63878,
                135572,
                126267,
                62055,
                102467,
                62095,
                114604,
                126879,
                93426,
                111319,
                75732,
                86021,
                88319,
                133395,
                134947,
                113548,
                142309,
                90498,
                72526,
                85813,
                69138,
                56743,
                112068,
                83130,
                50899,
                90175,
                108884,
                64655,
                76357,
                76793,
                105852,
                76055,
                64980,
                89676,
                51166,
                120137,
                142202,
                113950,
                145440,
                135280,
                130839,
                116871,
                96674,
                51818,
                112971,
                124729,
                147789,
                137949,
                52668,
                138880,
                110331,

                74024,
                92304,
                143261,
                92388,
                65770);

        for (Integer integer : integers) {
            sum = sum.add(BigInteger.valueOf(day1.calculateFuel(integer)));

        }

        assertEquals(BigInteger.valueOf(4983626), sum);
    }
}
