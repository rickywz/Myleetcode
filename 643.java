// 版本1：99.02%
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int max = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        max = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i];
            sum -= nums[i - k];
            if (sum > max)
                max = sum;
        }
        return max / (double)k;        
    }
}