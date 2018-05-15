// 版本1：47.46%
class Solution {
    public boolean isPalindrome(String s) {
        char[] ch = s.toLowerCase().toCharArray();
        int i = 0, j = ch.length - 1;
        boolean flag = true;
        while (true){
            while (i < ch.length && !(ch[i] >= '0' && ch[i] <= '9'
                    || ch[i] >= 'a' && ch[i] <= 'z'))
                i++;
            while (j > 0 && !(ch[j] >= '0' && ch[j] <= '9'
                    || ch[j] >= 'a' && ch[j] <= 'z'))
                j--;
            if (i >= j)
                break;
            if (ch[i] != ch[j]){
                flag = false;
                return flag;
            }
            i++;
            j--;
        }
        return flag;       
    }
}