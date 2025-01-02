package SlidingWindow;
import java.util.*;
public class Minimum_Window_Substring {
    public String minWindow(String s, String t) {
        int n=s.length();
        int count=t.length();
        if(n<count)return "";

        Map<Character,Integer> map=new HashMap<>();
        for(char ch:t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int i=0,j=0,startIdx=0;
        int size=Integer.MAX_VALUE;
        while(j<n){
            char currChar=s.charAt(j);
            if(map.containsKey(currChar) && map.get(currChar)>0){
                count--;
            }
            map.put(currChar,map.getOrDefault(currChar,0)-1);
            while(count==0){
                int currSize=j-i+1;
                if(currSize<size){
                    size=currSize;
                    startIdx=i;
                }
                char startChar=s.charAt(i);
                map.put(startChar,map.get(startChar)+1);
                if(map.containsKey(startChar) && map.get(startChar)>0){
                    count++;
                }
                i++;
            }
            j++;
        }
        return size==Integer.MAX_VALUE? "":s.substring(startIdx,startIdx+size);
    }
}
