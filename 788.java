// 版本1：14.59%
class Solution {
    public int rotatedDigits(int N) {
        int count = 0;
        boolean flag = false;
        for (int i = 1; i <= N ; i++) {
            for (char c : String.valueOf(i).toCharArray()) {
                if (c == '2' || c == '5' || c == '6' || c == '9'){
                    flag = true;
                }
                if (c == '3' || c == '4' || c == '7') {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                count++;
                flag = false;
            }
        }
        return count;       
    }
}

// 版本2：17.35%
class Solution {
    public int rotatedDigits(int N) {
        int count = 0;
        boolean flag = false;
        for (int i = 1; i <= N ; i++) {
            for (char c : String.valueOf(i).toCharArray()) {
                if (c == '3' || c == '4' || c == '7') {
                    flag = false;
                    break;
                }
                else if (c == '2' || c == '5' || c == '6' || c == '9')
                    flag = true;
            }
            if (flag == true) {
                count++;
                flag = false;
            }
        }
        return count;
    }
}

// 版本3：47.77%
class Solution {
    public int rotatedDigits(int N) {
        int count = 0;
        boolean flag = false;
        for (int i = 1; i <= N; i++) {
            int temp = i;
            while (temp > 0){
                if (temp % 10 == 3) {flag = false; break;}
                if (temp % 10 == 4) {flag = false; break;}
                if (temp % 10 == 7) {flag = false; break;}
                if (temp % 10 == 2) flag = true;
                if (temp % 10 == 5) flag = true;
                if (temp % 10 == 6) flag = true;
                if (temp % 10 == 9) flag = true;
                temp = temp / 10;
            }
            if (flag == true){
                count++;
                flag = false;
            }
        }
        return count;
    }
}

// 版本4：60.10%
class Solution {
    public int rotatedDigits(int N) {
        int count = 0;
        boolean flag = false;
        for (int i = 1; i <= N; i++) {
            int temp = i;
            while (temp > 0){
                int res = temp % 10;
                if (res == 3 || res == 4 || res == 7) {flag = false; break;}
                else if (res == 2 || res == 5 || res == 6 || res == 9) flag = true;
                temp = temp / 10;
            }
            if (flag == true){
                count++;
                flag = false;
            }
        }
        return count;
    }
}
