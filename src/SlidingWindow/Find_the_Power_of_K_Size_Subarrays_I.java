package SlidingWindow;
import java.util.*;
public class Find_the_Power_of_K_Size_Subarrays_I {
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        int[] result=new int[n-k+1];
        Arrays.fill(result,-1);
        int count=1;
        for(int i=1;i<k;i++){
            if(nums[i-1]+1==nums[i]){
                count++;
            }else{
                count=1;
            }
        }
        if(count==k){
            result[0]=nums[k-1];
        }
        int i=1;
        int j=k;
        while(j<n){
            if(nums[j-1]+1==nums[j]){
                count++;
            }else{
                count=1;
            }
            if(count>=k){
                result[i]=nums[j];
            }
            i++;
            j++;
        }
        return result;
    }
}
