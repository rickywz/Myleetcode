// 版本1:49.67%
public class Solution520 {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 1)
            return true;
        if (Character.isLowerCase(word.charAt(0)))
            for (int i = 1; i < word.length(); i++)
                if (Character.isUpperCase(word.charAt(i)))
                    return false;
        if (Character.isUpperCase(word.charAt(0))
                && Character.isUpperCase(word.charAt(1)))
            for (int j = 2; j < word.length(); j++)
                if (Character.isLowerCase(word.charAt(j)))
                    return false;
        if (Character.isUpperCase(word.charAt(0))
                && Character.isLowerCase(word.charAt(1)))
            for (int k = 2; k < word.length(); k++)
                if (Character.isUpperCase(word.charAt(k)))
                    return false;
        return true;
    }
}