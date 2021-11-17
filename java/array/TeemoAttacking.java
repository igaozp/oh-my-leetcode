
public class TeemoAttacking {
    public static class Solution {
        public int findPoisonedDuration(int[] timeSeries, int duration) {
            int result = duration;
            if (timeSeries.length == 0) {
                return 0;
            } else {
                for (int i = 1; i < timeSeries.length; i++) {
                    int temp = timeSeries[i] - timeSeries[i - 1];
                    result += Math.min(temp, duration);
                }
            }
            return result;
        }
    }
}