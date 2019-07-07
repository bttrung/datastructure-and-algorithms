package contests;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Contest144 {


    /**
     * Defanging an IP Address
     * <p>
     * https://leetcode.com/contest/weekly-contest-144/problems/defanging-an-ip-address/
     */
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[\\.]");
    }


    /**
     * Corporate Flight Bookings
     * <p>
     * https://leetcode.com/contest/weekly-contest-144/problems/corporate-flight-bookings/
     */

    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] asw = new int[n];
        for (int flight = 0; flight < n; flight++) {
            asw[flight] = 0;
        }

        for (int i = 0; i < bookings.length; i++) {
            int[] booking = bookings[i];
            int star = booking[0];
            int end = booking[1];
            int seat = booking[2];
            for (int k = star; k <= end; k++) {
                int currentVal = asw[k - 1];
                asw[k - 1] = currentVal + seat;
            }

        }

        return asw;
    }


    /**
     * Delete Nodes And Return Forest
     * <p>
     * https://leetcode.com/contest/weekly-contest-144/problems/delete-nodes-and-return-forest/
     */
    // TODO
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> results = new ArrayList<>();
        return results;
    }

    /**
     * Maximum Nesting Depth of Two Valid Parentheses Strings
     * <p>
     * https://leetcode.com/contest/weekly-contest-144/problems/maximum-nesting-depth-of-two-valid-parentheses-strings/
     */
    // TODO
    public int[] maxDepthAfterSplit(String seq) {
        return new int[]{};
    }

}
