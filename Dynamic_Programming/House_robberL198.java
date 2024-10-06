package Dynamic_Programming;

import java.util.Arrays;

public class House_robberL198 {
    public static void main(String[] args) {
        int[] arr={2,7,9,3,1};
        int[] dp=new int[arr.length];
        Arrays.fill(dp,-1);
//        System.out.println(Robber(arr,0,dp));
        System.out.println(Robber2(arr, arr.length-1, dp));
        System.out.println(RobberBU(arr));
    }
//    public static int Robber(int[] arr,int i,int[]dp){ //top down
//        if(i>= arr.length){
//            return 0;
//        }
//        if(dp[i]!=-1){
//            return dp[i];
//        }
//        int rob=arr[i]+Robber(arr,i+2,dp);
//        int dont_rob=Robber(arr,i+1,dp);
//        return dp[i]= Math.max(rob,dont_rob);
//    }

public static int Robber2(int[] arr,int i,int[]dp){ //top down backward
    if(i<0){
        return 0;
    }
    if(dp[i]!=-1){
        return dp[i];
    }
    int rob=arr[i]+Robber2(arr,i-2,dp);
    int dont_rob=Robber2(arr,i-1,dp);
    return dp[i]= Math.max(rob,dont_rob);
}
public static int RobberBU(int[] arr){
        if(arr.length==1){
            return arr[0];
        }
        int []dp=new int[arr.length];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[1],arr[0]);
        for(int i=2;i< dp.length;i++){
            int rob=arr[i]+dp[i-2];
            int dont_rob=dp[i-1];
            dp[i]=Math.max(rob,dont_rob);
        }
        return dp[dp.length-1];
}
}