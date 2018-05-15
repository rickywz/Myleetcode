// 版本1:72.74%
class Solution {
    public boolean isHappy(int n) {
        int temp = n;
        int res = 0;
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        while (temp != 1) {
            while (temp != 0) {
                res = temp % 10;
                sum += res * res;
                temp = temp / 10;
            }
            if (!set.add(sum))
                return false;
            temp = sum;
            sum = 0;
        }
        return true;        
    }
}