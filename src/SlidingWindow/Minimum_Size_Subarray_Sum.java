package SlidingWindow;

public class Minimum_Size_Subarray_Sum {
    public int minSubArrayLen(int target, int[] nums) {
        int max=Integer.MAX_VALUE;
        int sum=0;
        int i=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            while(sum>=target){
                max=Math.min(max,j-i+1);
                sum=sum-nums[i];
                i++;
            }
        }
        return max==Integer.MAX_VALUE?0:max;
    }
}
