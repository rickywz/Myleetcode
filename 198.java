class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int[] r = new int[nums.length];
        if (nums.length == 1)
            return nums[0];

        r[0] = nums[0];
        if (nums[1] > nums[0])
            r[1] = nums[1];
        else
            r[1] = nums[0];
        if (nums.length == 2)
            return r[1];

        if (nums[0] + nums[2] > nums[1])
            r[2] = nums[0] + nums[2];
        else
            r[2] = nums[1];
        if (nums.length == 3)
            return r[2];

        int q = Integer.MIN_VALUE;
        for (int i = 3; i < nums.length; i++) {
            q = Math.max(q, nums[i] + r[i - 2]);
            q = Math.max(q, nums[i - 1] + r[i - 3]);
            r[i] = q;
        }
        return r[nums.length - 1];
    }
}