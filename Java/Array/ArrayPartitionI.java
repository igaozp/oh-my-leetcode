import java.util.*;

public class Solution {
    public int arrayPairSum(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            result += nums[i] < nums[i + 1] ? nums[i] : nums[i + 1];
        }
        return result;
    }
}