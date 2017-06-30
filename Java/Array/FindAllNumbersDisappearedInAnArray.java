import java.util.Arrays;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<Integer>();
        int[] temp = new int[nums.length + 1];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = 1;
        }

        for (int i = 0; i < nums.length; i++) {
            temp[nums[i]] = 0;
        }

        for (int i = 1; i < temp.length; i++ ) {
            if (temp[i] != 0) {
                result.add(i);
            }
        }
        return result;
    }
}