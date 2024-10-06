package Dynamic_Programming;

import java.util.Arrays;

public class Minimum_path_sum_64 {
    public static void main(String[] args) {
        int [][] arr= {{1,3,1},{1,5,1},{4, 2, 1}};
        int dp[][] = new int[arr.length][arr[0].length];
        for (int []a:dp) {
            Arrays.fill(a,Integer.MAX_VALUE);
        }
        System.out.println(min_sum(arr,0,0,dp));
    }

    public static int min_sum(int[][] arr, int cr, int cc ,int dp[][] ) {

        if(cr == arr.length -1 && cc == arr[0].length-1){
            return arr[cr][cc];
        }
        if(cr >= arr.length || cc >= arr[0].length){
            return Integer.MAX_VALUE;
        }
        if(dp[cr][cc]!= Integer.MAX_VALUE)
            return dp[cr][cc];
        int h= min_sum(arr,cr,cc+1,dp);
        int v= min_sum(arr,cr+1,cc,dp);
        return dp[cr][cc]=Math.min(h,v) + arr[cr][cc];
    }
}
