import java.util.Arrays;

public class MissingNumber {
    public static class Solution {
        public int missingNumber(int[] nums) {
            int result = nums.length;
            Arrays.sort(nums);
            if (nums.length == 1) {
                if (nums[0] == 1) {
                    return 0;
                } else {
                    return 1;
                }
            }
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != i) {
                    result = i;
                    break;
                }
            }
            return result;
        }
    }
}