package contests;

public class Contest145 {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        return null;
    }

    public int longestWPI(int[] hours) {

        int result = 0;
        int longestTired = 0;
        int longestOK = 0;
        boolean lastIsTired = false;

        for (int i = 0; i < hours.length; i++) {
            int hour = hours[i];
            if (hour > 8) {

                if (!lastIsTired && longestTired > 0) {
                    longestTired = 0;
                } else{
                    longestTired++;
                }
                lastIsTired = true;

            } else {
                if (lastIsTired && longestOK > 0) {
                    longestOK = 0;
                } else {
                    longestOK++;
                }
                lastIsTired = false;
            }

            if (longestTired > longestOK) {
                int sum = longestTired + longestOK;
                result = sum > result ? sum : result;
            } else {
                result = longestTired > result ? longestTired : result;
            }


        }

        return result;

    }

}
