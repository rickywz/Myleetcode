// 版本1：34.73%
class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (int k : map.keySet()) {
            int cur = map.get(k);
            if (map.containsKey(k - 1)){
                int cur1 = cur + map.get(k - 1);
                if (cur1 > max)
                    max = cur1;
            }
            if (map.containsKey(k + 1)){
                int cur2 = cur + map.get(k + 1);
                if (cur2 > max)
                    max = cur2;
            }
        }
        return max;        
    }
}