package Advanced;

import java.util.Arrays;

public class DungeonGame_L174 {
    public static void main(String[] args) {
        int[] [] a={{-2,-3,3},{-5,-10,1},{10,30,-5}};
        int[][] dp= new int[a.length][a[0].length];
        for (int []a1: dp) {
            Arrays.fill(a1,-1);
        }
        System.out.println( calc(a,0,0,dp));
    }
    public static int calc(int[][] a,int cr,int cc,int[][]dp){
        if(cr==a.length || cc==a[0].length){
            return Integer.MAX_VALUE;
        }
        if(cr==a.length-1 && cc==a[0].length-1){
            return a[cr][cc]>0?1 :1-a[cr][cc];
        }
        if(dp[cr][cc]!=-1){
            return dp[cr][cc];
        }
        int ryt= calc(a,cr,cc+1,dp);
        int down= calc(a,cr+1,cc,dp);
        int initial= Math.min(ryt,down)-a[cr][cc];
        return dp[cr][cc]=initial >0 ?initial:1;

    }
}
