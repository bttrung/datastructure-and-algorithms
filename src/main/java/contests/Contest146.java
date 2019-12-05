package contests;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Contest146 {
    public int numEquivDominoPairs(int[][] dominoes) {

        Map<String, Integer>  hashMap = new HashMap<>();

        for (int i = 0; i < dominoes.length; i++) {
            int[] di = dominoes[i];
            String key = di[0] + String.valueOf(di[1]);
            String keyRevert = di[1] + String.valueOf(di[0]);

            if (hashMap.containsKey(key)) {
                Integer valKey = hashMap.get(key);
                hashMap.put(key, ++valKey);
            } else if (hashMap.containsKey(keyRevert)) {
                Integer valKey = hashMap.get(keyRevert);
                hashMap.put(key, ++valKey);
                hashMap.remove(keyRevert);
            } else {
                hashMap.put(key, 1);
            }

        }
        hashMap.values().removeIf(val -> val < 2);

        int result = 0;
        for (Integer value : hashMap.values()) {
            result += (value*(value-1))/2;
        }
        return result;
    }
}
