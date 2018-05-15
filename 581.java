// 版本1：32.41%
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        Arrays.sort(arr);
        int i = 0, j = nums.length - 1;
        while (i < nums.length){
            if (nums[i] != arr[i])
                break;
            i++;
        }
        if (i == nums.length)
            return 0;
        while (j >= 0){
            if (nums[j] != arr[j])
                break;
            j--;
        }
        return j - i + 1;       
    }
}