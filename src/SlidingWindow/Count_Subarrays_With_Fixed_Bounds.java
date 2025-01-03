package SlidingWindow;

public class Count_Subarrays_With_Fixed_Bounds {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int minInd=-1;
        int maxInd=-1;
        int dangerIdx=-1;
        long ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<minK || nums[i]>maxK){
                dangerIdx=i;
            }
            if(nums[i]==minK){
                minInd=i;
            }
            if(nums[i]==maxK){
                maxInd=i;
            }
            int min=Math.min(minInd,maxInd);
            int temp=min-dangerIdx;
            ans+=temp<=0?0:temp;
        }
        return ans;
    }
}
