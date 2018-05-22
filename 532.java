public class Solution532 {
    public static int findPairs(int[] nums, int k) {
/*        if (k < 0)
            return 0;
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (int s : map.keySet()) {
            if (k == 0){
                if (map.get(s) > 1)
                    count++;
                continue;
            }
            if (map.containsKey(s + k))
                count++;
            if (map.containsKey(s - k))
                count++;
        }
        if (k == 0)
            return count;
        return count / 2;*/

//        int ans = 0;
//        Arrays.sort(nums);
//        for (int i = 0, j = 0; i < nums.length; i++) {
//            for (j = Math.max(j, i + 1); j < nums.length &&
//                    (long) nums[j] - nums[i] < k; j++);
//            if (j < nums.length && (long) nums[j] - nums[i] == k)   ans++;
//            while (i + 1 < nums.length && nums[i] == nums[i + 1])   i++;
//        }
//        return ans;

        Arrays.sort(nums);

        int start = 0, end = 1, result = 0;
        while (start < nums.length && end < nums.length){
            if (start == end || nums[start] + k > nums[end]){
                end++;
            }else if (nums[start] + k < nums[end]){
                start++;
            }else {
                start++;
                result++;
                // start
                //  |
                // [1, 1, ...., 8, 8]
                //              |
                //              end
                while (start < nums.length && nums[start] == nums[start - 1]) start++;
                //end = Math.max(end + 1, start + 1);
                end++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{3, 1, 4, 1, 5};
        int[] test2 = new int[]{1, 2, 3, 4, 5};
        int[] test3 = new int[]{1, 3, 1, 5, 4};
        int[] test4 = new int[]{1, 2, 3, 4, 5};
        System.out.println(findPairs(test1, 2));
        System.out.println(findPairs(test2, 1));
        System.out.println(findPairs(test3, 0));
        System.out.println(findPairs(test4, -1));
    }
}