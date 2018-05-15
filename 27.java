// 版本1:99.06%
class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums == null)
            return 0;
        int i = 0, j = 0;
        while (j < nums.length){
            if (nums[j] == val)
                j++;
            else {
                nums[i] = nums[j];
                i++;
                j++;
            }
        }
        return i;        
    }
}