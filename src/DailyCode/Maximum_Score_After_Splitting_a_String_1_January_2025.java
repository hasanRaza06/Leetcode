package DailyCode;

public class Maximum_Score_After_Splitting_a_String_1_January_2025 {
    public int maxScore(String s) {
        int max=0;
        for(int j=1;j<s.length();j++) {
            int zero = 0;
            int one = 0;
            // find the number of zero to the given index
            for (int i =j-1; i>=0; i--) {
                if (s.charAt(i) == '0')
                    zero++;
            }
            // find the number of one form the given index to the length
            for(int i=j;i<s.length();i++){
                if(s.charAt(i)=='1')
                    one++;
            }
            // store the maximum value in the max
            max=Math.max(max,one+zero);
        }
        return max;
    }
}
