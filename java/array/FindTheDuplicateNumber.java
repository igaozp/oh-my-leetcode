
public class FindTheDuplicateNumber {
    public static class Solution {
        public int findDuplicate(int[] nums) {
            int result = 0;
            int slow = nums[0];
            int fast = nums[slow];

            while (slow != fast) {
                slow = nums[slow];
                fast = nums[nums[fast]];
            }

            fast = 0;

            while (slow != fast) {
                fast = nums[fast];
                slow = nums[slow];
            }

            result = slow;

            return result;
        }
    }
}