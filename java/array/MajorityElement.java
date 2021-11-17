import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static class Solution {
        public int majorityElement(int[] nums) {
            int size = nums.length;
            int k = 0;
            int v = 0;

            Map<Integer, Integer> map = new HashMap<>();

            for (int num : nums) {
                map.put(num, 0);
            }

            for (int key : nums) {
                int val = map.get(key);
                if (map.containsKey(key)) {
                    map.put(key, ++val);
                }
            }

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > v) {
                    k = entry.getKey();
                    v = entry.getValue();
                }
            }

            return k;
        }
    }
}
