// 版本1：98.4%
class Solution {
    public String reverseVowels(String s) {
        char[] ans = s.toCharArray();
        int n = ans.length;
        int i = 0, j = n - 1;
        while (true){
            while (i < n && ans[i] != 'a' && ans[i] != 'e' && ans[i] != 'i'
                    && ans[i] != 'o' && ans[i] != 'u'&& ans[i] != 'A' && ans[i] != 'E' && ans[i] != 'I'
                    && ans[i] != 'O' && ans[i] != 'U')
                i++;
            while (j > 0 && ans[j] != 'a' && ans[j] != 'e' && ans[j] != 'i'
                    && ans[j] != 'o' && ans[j] != 'u'&& ans[j] != 'A' && ans[j] != 'E' && ans[j] != 'I'
                    && ans[j] != 'O' && ans[j] != 'U')
                j--;
            if (i > j)
                break;
            char temp = ans[i];
            ans[i] = ans[j];
            ans[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(ans);      
    }
}