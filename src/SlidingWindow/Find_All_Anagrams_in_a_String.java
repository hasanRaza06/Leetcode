package SlidingWindow;
import java.util.*;
public class Find_All_Anagrams_in_a_String {
    public boolean allZero(int[] arr){
        for(int val:arr){
            if(val!=0)return false;
        }
        return true;
    }
    public List<Integer> findAnagrams(String txt, String pat) {
        int n = txt.length();
        int k = pat.length();
        int[] temp = new int[26];
        for (char ch : pat.toCharArray()) {
            temp[ch - 'a']++;
        }

        int i = 0, j = 0;
        List<Integer> res=new ArrayList<>();
        while (j < n) {
            temp[txt.charAt(j) - 'a']--;
            if (j - i + 1 == k) {
                if (allZero(temp)) {
                    res.add(i);
                }
                temp[txt.charAt(i) - 'a']++;
                i++;
            }

            j++;
        }
        return res;
    }
}
