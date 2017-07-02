public class Solution {
    public void moveZeroes(int[] nums) {
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (nums[i] == 0) {
                int temp = nums[i];
                int index = i;
                for (int j = i + 1; j < size; j++) {
                    if (nums[j] != 0) {
                        nums[index] = nums[j];
                        nums[j] = temp;
                        index = j;
                    }
                }
            }
        }
    }
}