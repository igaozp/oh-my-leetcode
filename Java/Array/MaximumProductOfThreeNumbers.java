public class Solution {
    public int maximumProduct(int[] nums) {
        int result = 1;
        int size = nums.length;
        Arrays.sort(nums);
        int temp = nums[size - 1];

        for (int i = 0; i < 3; i++) {
            result *= nums[size - i - 1];
        }

        for (int i = 0; i < 2; i++) {
            temp *= nums[i];
        }

        if (temp > result) {
            result = temp;
        }

        return result;
    }
}