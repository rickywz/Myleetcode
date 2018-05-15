// 版本1：48.00%
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, k = 0;
        int[] arr = new int[m + n];
        while (i < m && j < n){
            if (nums1[i] < nums2[j]){
                arr[k] = nums1[i];
                i++;
                k++;
            }
            else {
                arr[k] = nums2[j];
                j++;
                k++;
            }
        }
        while (i < m){
            arr[k] = nums1[i];
            k++;
            i++;
        }
        
        while (j < n){
            arr[k] = nums2[j];
            k++;
            j++; 
        }
        
        for (int l = 0; l < k; l++) {
            nums1[l] = arr[l];
        }     
    }
}
// 版本2：48% ？？？
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        for (int k = m + n - 1; k >= 0; k--) {
            if (i < 0) {
                nums1[k] = nums2[j--];
                continue;
            }
            if (j < 0) {
                nums1[k] = nums1[i--];
                continue;
            }
            if (nums1[i] >= nums2[j]) {
                nums1[k] = nums1[i--];                
            } else {
                nums1[k] = nums2[j--];                
            }
        }        
    }
}