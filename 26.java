// 版本1:6.82%
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 1;
        while (j < nums.length){
            if (nums[j] <= nums[i]) {
                j++;
            }
            else {
                nums[i + 1] = nums[j];
                i++;
                j = i + 1;
            }
        }
        return i + 1;        
    }
}

// 版本2：64.8%
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 1;
        while (j < nums.length){
            if (nums[j] <= nums[i]) {
                j++;
            }
            else {
                nums[i + 1] = nums[j];
                i++;
                j++;
            }
        }
        return i + 1;        
    }
}