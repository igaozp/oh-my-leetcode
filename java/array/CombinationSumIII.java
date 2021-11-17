import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    public static class Solution {
        public List<List<Integer>> combinationSum3(int k, int n) {
            List<List<Integer>> result = new ArrayList<>();
            select(result, new ArrayList<>(), k, 1, n);
            return result;
        }

        public void select(List<List<Integer>> result, List<Integer> temp, int k, int start, int n) {
            // 匹配成功，添加到列表中并返回
            if (temp.size() == k && n == 0) {
                List<Integer> list = new ArrayList<>(temp);
                result.add(list);
                return;
            }

            for (int i = start; i <= 9; i++) {
                temp.add(i);
                select(result, temp, k, i + 1, n - i);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
