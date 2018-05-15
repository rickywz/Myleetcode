// 版本1：10.99%
class Solution {
    public int countBinarySubstrings(String s) {
        int i = 0;
        int outcount = 0;
        while (i < s.length()){
            char temp1 = s.charAt(i);
            int count1 = 0;
            while (i < s.length() && s.charAt(i) == temp1){
                i++;
                count1++;
            }
            if (i < s.length()) {
                char temp2 = s.charAt(i);
                int count2 = 0;
                while (i < s.length() && s.charAt(i) == temp2) {
                    i++;
                    count2++;
                }
                if (count1 >= count2)
                    outcount += count2;
                else
                    outcount += count1;
                i = i - count2;
            }
        }
        return outcount;        
    }
}

// 版本2：54.83%
class Solution {
    public int countBinarySubstrings(String s) {
        int i = 0;
        int outcount = 0;
        char temp1 = s.charAt(i);
        int count1 = 0;
        while (i < s.length() && s.charAt(i) == temp1){
            i++;
            count1++;
        }
        while (i < s.length()) {
            char temp2 = s.charAt(i);
            int count2 = 0;
            while (i < s.length() && s.charAt(i) == temp2) {
                i++;
                count2++;
            }
            if (count1 >= count2)
                outcount += count2;
            else
                outcount += count1;
            count1 = count2;
        }
        return outcount;         
    }
} 