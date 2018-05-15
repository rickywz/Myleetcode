// 版本1：52.13%
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for (int i = 1; i < s.length(); i++) {
            boolean flag = true;
            int count = s.length() / i;
            if (count > 1 && s.length() % i == 0){
                for (int j = 0; j < i; j++){
                    int k = j;
                    while (k < s.length() - i){
                        if (s.charAt(k) != s.charAt(k + i)) {
                            flag = false;
                            break;
                        }
                        k += i;
                    }
                    if (flag == false)
                        break;
                }
                if (flag == true)
                    return true;
            }
        }
        return false;       
    }
}
// 版本2:63.69%
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for (int i = 1; i <= s.length() / 2; i++) {
            boolean flag = true;
            if (s.length() / i > 1 && s.length() % i == 0){
                for (int j = 0; j < i; j++){
                    int k = j;
                    while (k < s.length() - i){
                        if (s.charAt(k) != s.charAt(k + i)) {
                            flag = false;
                            break;
                        }
                        k += i;
                    }
                    if (flag == false)
                        break;
                }
                if (flag == true)
                    return true;
            }
        }
        return false;     
    }
}