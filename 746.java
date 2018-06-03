class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if (cost == null || cost.length == 0)
            return 0;

        int[] r = new int[cost.length];
        if (cost.length == 1)
            return cost[0];

        r[0] = cost[0];
        r[1] = cost[1];
        if (cost.length == 2)
            return r[1];

        int q = Integer.MAX_VALUE;
        for (int i = 2; i < cost.length; i++) {
            if (r[i - 1] > r[i - 2])
                q = r[i - 2];
            else
                q = r[i - 1];
            r[i] = q + cost[i];
        }
        return Math.min(r[cost.length - 1], r[cost.length - 2]);        
    }
}