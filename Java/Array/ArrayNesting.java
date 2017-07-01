import java.util.Set;

public class Solution {
    public int arrayNesting(int[] nums) {
        int result = 0;
        Set<Integer> contain = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
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