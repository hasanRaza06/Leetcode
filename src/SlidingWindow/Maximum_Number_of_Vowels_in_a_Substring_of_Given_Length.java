package SlidingWindow;

public class Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length {
    public int maxVowels(String s, int k) {
        int maxV  = 0;
        int count = 0;
        int n=s.length();
        int i = 0, j = 0;
        while(j < n) {
            //if you found a vowel then increse the count
            if(isVowel(s.charAt(j)))
                count++;
            //if your windows lngth is equlas to k
            if(j-i+1 == k) {
                //stor the max of count and maxV
                maxV = Math.max(maxV, count);
                //if char at i is vowel then decrese the count
                if(isVowel(s.charAt(i)))
                    count--;
                //increse i
                i++;
            }
            //increse j
            j++;
        }
        //return maxV
        return maxV;
    }
    //return true if given cgaracter is vowel else false
    public boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
}
