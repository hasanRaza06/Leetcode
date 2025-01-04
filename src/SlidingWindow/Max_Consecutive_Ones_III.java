package SlidingWindow;

public class Max_Consecutive_Ones_III {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int i=0,j=0,max=0,zero=0;
        while(j<n){
            if(nums[j]==0)zero++;
            while(zero>k){
                if(nums[i]==0)zero--;
                i++;
            }
            if(zero<=k){
                max=Math.max(max,j-i+1);
            }
            j++;
        }
        return max;
    }
}
