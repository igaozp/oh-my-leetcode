
public class MaxConsecutiveOnes {
    public static class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int max = 0;
            int temp = 0;
            for (int num : nums) {
                if (num == 1) {
                    temp++;
                } else {
                    temp = 0;
                }
                if (temp > max) {
                    max = temp;
                }
            }
            return max;
        }
    }
}
