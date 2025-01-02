package SlidingWindow;
import java.util.*;
public class First_negative_inevery_window_of_size_k {
    static List<Integer> FirstNegativeInteger(int arr[], int k) {
        // write code here
        int n=arr.length;
        int i=0,j=0;
        List<Integer> neg=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        while(j<n){
            if(arr[j]<0){
                neg.add(arr[j]);
            }
            if(j-i+1==k){
                if(neg.size()>0){
                    res.add(neg.get(0));
                }
                else {
                    res.add(0);
                }
                if(arr[i]<0){
                    neg.remove(0);
                }
                i++;
            }
            j++;
        }
        return res;
    }
}
