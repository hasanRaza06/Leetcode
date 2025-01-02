package SlidingWindow;
import java.util.*;
public class Contains_Duplicate_II {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        int i=0,j=0;
        while(j<nums.length){
            if(j-i>k){
                set.remove(nums[i]);
                i++;
            }
            if(set.contains(nums[j])){
                return true;
            }
            set.add(nums[j]);
            j++;
        }
        return false;
    }
}
