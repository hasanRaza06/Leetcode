package DailyCode;

public class Number_of_Ways_to_Split_Array_3_January_2025 {
    public int waysToSplitArray(int[] nums) {
        // int count=0;
        // int n=nums.length;
        // for(int i=0;i<n-1;i++){
        //     int leftSum=0,rightSum=0;
        //     for(int j=0;j<=i;j++){
        //         leftSum+=nums[j];
        //     }
        //     for(int j=i+1;j<n;j++){
        //         rightSum+=nums[j];
        //     }
        //     if(leftSum>=rightSum)count++;
        // }
        // return count;

        int count=0;
        long totalSum=0;
        for(int val:nums){
            totalSum+=val;
        }
        long leftSum=0;
        for(int i=0;i<nums.length-1;i++){
            leftSum+=nums[i];
            long rightSum=totalSum-leftSum;
            if(leftSum>=rightSum)count++;
        }
        return count;
    }
}
