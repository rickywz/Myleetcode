// 版本1:31.53%
class Solution {
    public boolean checkRecord(String s) {
        int count = 0;
        if (BruteForce(s, "LLL"))
            return false;
        else {
            for (char c : s.toCharArray()) {
                if (c == 'A')
                    count++;
            }
            if (count > 1)
                return false;
            else
                return true;
        }
    }
    public boolean BruteForce(String txt, String pattern){
        int i, N = txt.length();
        int j, M = pattern.length();
        for (i = 0, j = 0; i < N && j < M; i++){
            if (txt.charAt(i) == pattern.charAt(j))
                j++;
            else {
                i -= j;
                j = 0;
            }
        }
        if (j == M)
            return true;
        else
            return false;
    }
}

// 版本2：65.52%
class Solution {
    public boolean checkRecord(String s) {
        int i = 0;
        int count = 0;
        while (i < s.length()){
            if (s.charAt(i) == 'A')
                count++;
            if (count >= 2)
                return false;
            if (s.charAt(i) == 'L'){
                if (i < s.length() - 2 && s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L')
                    return false;
            }
            i++;
        }
        return true;
    }
}