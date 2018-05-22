// 版本1:81.18%
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1, high = n;
        while (low < high){
            int mid = low + (high - low) / 2;
            if (!isBadVersion(mid))
                low = mid + 1;
            else
                high = mid - 1;
        }
        if (isBadVersion(low))
            return low;
        else 
            return low + 1;        
    }
}