package Dynamic_Programming;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum931 {
    public static void main(String[] args) {

        int [][]arr= {{2,1,3},{6,5,4},{7,8,9}};
        int dp[][] = new int[arr.length][arr[0].length];
        for (int []a:dp) {
            Arrays.fill(a,Integer.MAX_VALUE);
        }
        int ans= Integer.MAX_VALUE;
        for (int i = 0; i <arr[0].length ; i++) {
            ans= Math.min(ans,falling_path(arr,0,i,dp));
        }
        System.out.println(ans);
    }

    public static int falling_path(int[][] arr, int cr, int cc, int dp[][]) {
        if(cr >= arr.length || cc <0 || cc >= arr[0].length)
            return Integer.MAX_VALUE;
        if(cr==arr.length-1){
            return arr[cr][cc];
        }
        if(dp[cr][cc] != Integer.MAX_VALUE){
            return dp[cr][cc];
        }

        int ld= falling_path(arr,cr+1,cc-1,dp);
        int down= falling_path(arr,cr+1,cc,dp);
        int rd= falling_path(arr,cr+1,cc+1,dp);
        return  dp[cr][cc]=Math.min(down,Math.min(ld,rd)) +arr[cr][cc];
    }

}
