import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public static class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            Arrays.sort(nums);
            List<Integer> result = new ArrayList<>();
            int[] temp = new int[nums.length + 1];

            Arrays.fill(temp, 1);

            for (int num : nums) {
                temp[num] = 0;
            }

            for (int i = 1; i < temp.length; i++) {
                if (temp[i] != 0) {
                    result.add(i);
                }
            }
            return result;
        }
    }
}