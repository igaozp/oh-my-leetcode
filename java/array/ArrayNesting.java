import java.util.HashSet;
import java.util.Set;

public class ArrayNesting {
    public static class Solution {
        public int arrayNesting(int[] nums) {
            int result = 0;
            Set<Integer> contain = new HashSet<>();
            for (int num : nums) {
                int temp = num;
                int counter = 0;
                while (!contain.contains(temp)) {
                    contain.add(temp);
                    counter++;
                    temp = nums[temp];
                }
                if (counter > result) {
                    result = counter;
                }
            }
            return result;
        }
    }
}