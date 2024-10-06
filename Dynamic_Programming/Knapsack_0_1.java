package Dynamic_Programming;

import java.util.Arrays;

public class Knapsack_0_1 {
    //You are packing for a vacation on the sea side and you are going to carry only one bag with capacity S (1 <= S <= 1000).
    //You also have N (1<= N <= 1000) items that you might want to take with you to the sea side.
    //Unfortunately you can not fit all of them in the knapsack so you will have to choose.
    //For each item you are given its size and its value.
    //You want to maximize the total value of all the items you are going to bring.
    //What is this maximum total value?
    //INPUT: 5 4
    //1 2 3 2 2
    //8 4 0 5 3
    //
    //Output
    //
    //13
    public static void main(String[] args) {
       int cap=11;
        int []wt={3, 2, 4, 5, 1};

        int []val={4 ,3 ,5 ,6 ,1};
        int[][]dp=new int[cap+1][wt.length+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j]=-1;
            }
        }
        System.out.println(Knapsack(wt,val,cap,0,dp));

    }
    public static int Knapsack(int[] wt,int[] val,int cap,int i,int[][]dp){
        if(i==wt.length || cap==0)
                return 0;
        if(dp[cap][i]!=-1){
            return dp[cap][i];
        }
        int inc=0;
        int exc=0;
        if(cap>=wt[i]){
            inc= val[i]+Knapsack(wt,val,cap-wt[i],i+1,dp);
        }
        exc=Knapsack(wt,val,cap,i+1,dp);
        return dp[cap][i]= Math.max(inc,exc);
    }
}
