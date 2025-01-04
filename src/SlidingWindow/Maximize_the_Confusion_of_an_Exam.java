package SlidingWindow;

public class Maximize_the_Confusion_of_an_Exam {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int n=answerKey.length();
        int i=0,j=0,result=0,maxF=0;
        while(j<n){
            if(answerKey.charAt(j)=='F')maxF++;
            while(maxF>k){
                if(answerKey.charAt(i)=='F')maxF--;
                i++;
            }
            result=Math.max(result,j-i+1);
            j++;
        }
        i=0;
        j=0;
        int maxT=0;
        while(j<n){
            if(answerKey.charAt(j)=='T')maxT++;
            while(maxT>k){
                if(answerKey.charAt(i)=='T')maxT--;
                i++;
            }
            result=Math.max(result,j-i+1);
            j++;
        }
        return result;
    }
}
