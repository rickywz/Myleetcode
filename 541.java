// 版本1：67.31%
public class Solution541 {
    public String reverseStr(String s, int k) {
        char[] res = s.toCharArray();
        int i = 0;
        for (i = 0; i < res.length / (2 * k); i++) {
            reverse(res, 2 * k * i, 2 * k * i + k - 1);
        }
        if (res.length % (2 * k) < k)
            reverse(res, 2 * k * i, res.length - 1);
        else
            reverse(res, 2 * k * i, 2 * k * i + k - 1);
        return String.valueOf(res);
    }
    public void reverse(char[] s, int i, int j){
        for (int k = i, m = j; k < m; k++, m--) {
            char temp = s[k];
            s[k] = s[m];
            s[m] = temp;
        }
    }
}