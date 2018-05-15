版本1：26.49%
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        int minLength = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < minLength){
                minLength = strs[i].length();
                index = i;
            }
        }
        for (int i = 0; i < strs[index].length(); i++){
            int j;
            for (j = 0; j < strs.length; j++) {
                if (!BruteForce(strs[j], strs[index].substring(0, strs[index].length() - i)))
                    break;
            }
            if (j == strs.length)
                return strs[index].substring(0, strs[index].length() - i);
        }
        return "";
    }

    public boolean BruteForce(String txt, String pat){
        int j = 0, M = pat.length();
        int i = 0, N = txt.length();
        while (i < N && j < M && txt.charAt(i) == pat.charAt(j)) {
            i++;
            j++;
        }
        if (j == M)
            return true;
        return false;
    }
}

版本2：95.3%
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        int minLength = Integer.MAX_VALUE;
        int index = 0;
        int len = strs.length;
        for (int i = 0; i < len; i++) {
            if (strs[i].length() < minLength){
                minLength = strs[i].length();
                index = i;
            }
        }
        int sublen = strs[index].length();
        for (int i = 0; i < sublen; i++){
            int j;
            for (j = 0; j < len; j++) {
                if (!BruteForce(strs[j], strs[index].substring(0, sublen - i)))
                    break;
            }
            if (j == strs.length)
                return strs[index].substring(0, sublen - i);
        }
        return "";
    }

    public boolean BruteForce(String txt, String pat){
        int j = 0, M = pat.length();
        int i = 0, N = txt.length();
        while (i < N && j < M && txt.charAt(i) == pat.charAt(j)) {
            i++;
            j++;
        }
        if (j == M)
            return true;
        return false;
    }
}