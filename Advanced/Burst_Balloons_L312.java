package Advanced;

import java.sql.Array;
import java.util.Arrays;

public class Burst_Balloons_L312 {
    public static void main(String[] args) {
        int[] a= {3,1,5,8};
        int [] arr= new int[a.length+2];
        int[] [] dp= new int[arr.length][arr.length];
        for (int []a1: dp) {
            Arrays.fill(a1,-1);
        }
        arr[0]=arr[arr.length-1]=1;
        for(int i=1;i<= arr.length-2;i++){
            arr[i]=a[i-1];
        }
        System.out.println(burst(arr,0,arr.length-1,dp));
    }
    public static int burst(int[] arr,int si,int ei,int[][]dp){
        if(si+1==ei){
            return 0;
        }
        if(dp[si][ei]!=-1){
            return dp[si][ei];
        }
        int ans=Integer.MIN_VALUE;
        for (int k=si+1;k<ei;k++){
            int left=burst(arr,si,k,dp);
            int ryt= burst(arr,k,ei,dp);
            int self= arr[si]* arr[k]*arr[ei];
            ans=Math.max(ans,left+ryt+self);
        }
        return dp[si][ei]=ans;
    }
}
