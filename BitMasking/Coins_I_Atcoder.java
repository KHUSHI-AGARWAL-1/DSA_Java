package BitMasking;
//Let N be a positive odd number.There are
//N coins, numbered 1,2,…,N. For each i (1≤i≤N), when Coin i is tossed, it comes up heads with probability pi and tails
// with probability 1−pi​.
//Taro has tossed all the N coins. Find the probability of having more heads than tails.

import java.util.Arrays;

public class Coins_I_Atcoder {
    public static void main(String[] args) {
        double[]c={0.30,0.60,0.80};
        int n=c.length;
        double [][] dp=new double[n][(n+4)/2];
        for (double[] a:dp){
            Arrays.fill(a,-1);
        }
        System.out.println(prob(c,0,(n+1)/2,dp));
    }

    private static double prob(double[] c, int i, int h,double[][] dp) {
        if(h==0) return 1;
        if(i==c.length) return 0;
        if(dp[i][h]!=-1) return dp[i][h];
        double ans=c[i]*prob(c,i+1,h-1,dp)+(1-c[i])*prob(c,i+1,h,dp);
        return dp[i][h]=ans;
    }
}
