package SlidingWindow;
import java.util.*;
public class Sliding_Window_Maximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> q=new ArrayDeque<>();
        int n=nums.length;
        int i=0,j=0,ptr=0;
        int[] res=new int[n-k+1];
        while(j<n){
            while(!q.isEmpty() && q.peekLast()<nums[j]){
                q.pollLast();
            }
            q.add(nums[j]);

            if(j-i+1<k){
                j++;
            }else if(j-i+1==k){
                res[ptr++]=q.peek();
                if(nums[i]==q.peek()){
                    q.pollFirst();
                }
                i++;
                j++;
            }
        }
        return res;
    }
}
