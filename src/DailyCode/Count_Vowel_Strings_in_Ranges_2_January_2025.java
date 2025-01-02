package DailyCode;

public class Count_Vowel_Strings_in_Ranges_2_January_2025 {
    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int N = words.length;
        int Q = queries.length;
        int[] result = new int[Q];
        int[] cumSum = new int[N];

        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1))) {
                sum++;
            }
            cumSum[i] = sum;
        }

        for (int i = 0; i < Q; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            result[i] = cumSum[r] - (l > 0 ? cumSum[l - 1] : 0);
        }

        return result;
    }
}
