package SlidingWindow;

public class Longest_Subarray_of_1s_After_Deleting_One_Element {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int i=0,j=0;
        int max=0;
        int zero=0;
        while(j<n){
            if(nums[j]==0)zero++;
            while(zero>1){
                if(nums[i]==0){
                    zero--;
                }
                i++;
            }
            max=Math.max(max,j-i);
            j++;
        }
        return max;
    }
}
