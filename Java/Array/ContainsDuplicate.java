public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        for (int i = 0; i < size - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}