package Dynamic_Programming;

import java.util.Arrays;

public class min_climbing_stairsL746 {
    public static void main(String[] args) {
        int[] arr={1,100,1,1,1,100,1,1,100,1};
        int[] dp=new int[arr.length];
        Arrays.fill(dp,-1);
        int zeroth=Min_Cost(arr,0,dp);
        int first=Min_Cost(arr,1,dp);

        System.out.println(Math.min(first,zeroth));
    }
    public static int Min_Cost(int[] arr,int i,int[]dp){
        if(i>= arr.length)
                return 0;
        if(dp[i]!=-1){
            return dp[i];
        }
        int first=Min_Cost(arr,i+1,dp);
        int sec=Min_Cost(arr, i+2,dp);
        return dp[i]= Math.min(sec,first)+arr[i];
    }

}
