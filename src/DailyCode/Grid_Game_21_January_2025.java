package DailyCode;

public class Grid_Game_21_January_2025 {
    public long gridGame(int[][] grid) {
        long firstRorRemainingSum=sum(grid[0]);
        long secondRowRemainingSum=0;
        long minimizedRobot2Sum=Long.MAX_VALUE;
        for(int col=0;col<grid[0].length;col++){
            firstRorRemainingSum-=grid[0][col];
            long maxOfRobot2=Math.max(firstRorRemainingSum,secondRowRemainingSum);
            minimizedRobot2Sum=Math.min(minimizedRobot2Sum,maxOfRobot2);
            secondRowRemainingSum+=grid[1][col];
        }
        return minimizedRobot2Sum;
    }
    public long sum(int[] arr){
        long sum=0;
        for(int val:arr){
            sum+=val;
        }
        return sum;
    }
}
