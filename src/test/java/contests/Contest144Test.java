package contests;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Contest144Test {

    Contest144 contest144 = new Contest144();

    @Test
    public void testIpAddress() {
        String defangIPaddr = contest144.defangIPaddr("1.1.1.1");
        assertEquals("1[.]1[.]1[.]1", defangIPaddr);
    }

    @Test
    public void testFlightBooking() {
        int[][] bookings = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        int[] ints = contest144.corpFlightBookings(bookings, 5);
        int[] ans = {10, 55, 45, 25, 25};
        Assert.assertEquals(Arrays.toString(ans), Arrays.toString(ints));
    }

}
