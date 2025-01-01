package SlidingWindow;

public class Count_Occurences_of_Anagrams {
    boolean allZero(int[] arr){
        for(int val:arr){
            if(val!=0)return false;
        }
        return true;
    }

    int search(String pat, String txt) {
        // code here
        int n=txt.length();
        int k=pat.length();
        int[] temp=new int[26];
        for(char ch:pat.toCharArray()){
            temp[ch-'a']++;
        }
        int i=0,j=0,count=0;
        while(j<n){
            temp[txt.charAt(j)-'a']--;
            if(j-i+1==k){
                if(allZero(temp)){
                    count++;
                }
                temp[txt.charAt(i)-'a']++;
                i++;
            }
            j++;
        }
        return count;
    }
}
