public class Solution {
    public int majorityElement(int[] nums) {
        int size = nums.length;
        int k = 0;
        int v = 0;

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < size; i++) {
            map.put(nums[i], 0);
        }

        for (int i = 0; i < size; i++) {
            int key = nums[i];
            int val = map.get(key);
            if (map.containsKey(key)) {
                map.put(key, ++val);
            }
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() > v) {
                k = entry.getKey();
                v = entry.getValue();
            }
        }

        return k;
    }
}