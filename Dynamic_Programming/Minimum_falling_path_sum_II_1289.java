package Dynamic_Programming;

import java.util.Arrays;

public class Minimum_falling_path_sum_II_1289 {
    public static void main(String[] args) {
        int [][] arr= {{1,2,3},{4,5,6},{7,8,9}};
        int dp[][] = new int[arr.length][arr[0].length];
        for (int []a:dp) {
            Arrays.fill(a,Integer.MAX_VALUE);
        }
        int ans= Integer.MAX_VALUE;
        for (int i = 0; i <arr[0].length ; i++) {
            ans= Math.min(ans,falling_pathII(arr,0,i,dp));
        }
        System.out.println(ans);
    }
    public static int falling_pathII(int arr[][], int cr, int cc, int dp [][]){
        if(cr== arr.length-1)
            return arr[cr][cc];
        if(dp[cr][cc] != Integer.MAX_VALUE)
            return dp[cr][cc];

        int ans= Integer.MAX_VALUE;
        for (int i = 0; i <arr[0].length ; i++) {
            if(i != cc)
                ans= Math.min(ans,falling_pathII(arr, cr+1,i, dp));
        }
        return dp [cr][cc] = ans+ arr[cr][cc];

    }
}
