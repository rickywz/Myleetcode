// 版本1:77.28%
class Solution {
    public int dominantIndex(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= max1){
                max2 = max1;
                max1 = nums[i];
                index = i;
            }else if (nums[i] >= max2)
                max2 = nums[i];
        }
        if (max1 >= 2 * max2)
            return index;
        return -1;        
    }
}