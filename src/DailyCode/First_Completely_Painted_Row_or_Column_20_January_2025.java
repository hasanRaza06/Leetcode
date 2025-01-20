package DailyCode;
import java.util.*;

public class First_Completely_Painted_Row_or_Column_20_January_2025 {
}

// Brute Force
class Solution2 {
    public boolean rowMarked(int[][] mat,int row){
        for(int col=0;col<mat[0].length;col++){
            if(mat[row][col]>0){
                return false;
            }
        }
        return true;
    }

    public boolean colMarked(int[][] mat,int col){
        for(int row=0;row<mat.length;row++){
            if(mat[row][col]>0){
                return false;
            }
        }
        return true;
    }

    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;

        Map<Integer,int[]> map=new HashMap<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int val=mat[i][j];
                map.put(val,new int[]{i,j});
            }
        }
        for(int i=0;i<arr.length;i++){
            int val=arr[i];
            int[] coordinates = map.get(val);
            int row = coordinates[0], col = coordinates[1];
            mat[row][col]*=-1;
            if(rowMarked(mat,row) || colMarked(mat,col)){
                return i;
            }
        }
        return -1;
    }
}

// Better
class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        Map<Integer, int[]> mp = new HashMap<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int val = mat[i][j];
                mp.put(val, new int[]{i, j});
            }
        }

        int[] rowCountPaint = new int[m];
        int[] colCountPaint = new int[n];

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            int[] coordinates = mp.get(val);
            int row = coordinates[0], col = coordinates[1];

            rowCountPaint[row]++;
            colCountPaint[col]++;

            if (rowCountPaint[row] == n || colCountPaint[col] == m) {
                return i;
            }
        }
        return -1;
    }
}

//Optimal

class Solution3 {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            mp.put(arr[i], i);
        }

        int minIndex = Integer.MAX_VALUE;

        // Check each row
        for (int row = 0; row < m; row++) {
            int lastIndex = Integer.MIN_VALUE;

            for (int col = 0; col < n; col++) {
                int val = mat[row][col];
                int idx = mp.get(val);
                lastIndex = Math.max(lastIndex, idx);
            }

            minIndex = Math.min(minIndex, lastIndex);
        }

        // Check each column
        for (int col = 0; col < n; col++) {
            int lastIndex = Integer.MIN_VALUE;

            for (int row = 0; row < m; row++) {
                int val = mat[row][col];
                int idx = mp.get(val);
                lastIndex = Math.max(lastIndex, idx);
            }

            minIndex = Math.min(minIndex, lastIndex);
        }

        return minIndex;
    }
}


