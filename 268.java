// 版本1:49.48%
class Solution {
    public int missingNumber(int[] nums) {
        int[] res = new int[nums.length + 1];
        int out  = -1;
        for (int i = 0; i < nums.length; i++) {
            res[nums[i]]++;
        }
        for (int i = 0; i < res.length; i++) {
            if (res[i] == 0) {
                out = i;
                break;
            }
        }
        return out;        
    }
}

// 版本2:100%
class Solution {
    public int missingNumber(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;        
    }
}