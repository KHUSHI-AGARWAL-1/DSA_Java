package Dynamic_Programming;

import java.util.Arrays;

//FUTURE DP
public class Wine_Problem {
    public static void main(String[] args) {
        int[] w={2,4,6,2,5};

        int[][]dp=new int[w.length+1][w.length+1];
        for(int[]a:dp){
            Arrays.fill(a,-1);
        }
        System.out.println(Wine_Profit(w,0,w.length-1,1,dp));
    }


    public static int Wine_Profit(int[] w,int i,int j,int year,int[][]dp){
        if(i>j){
            return 0;
        }
        if(i == j) return w[i] * year;
        if(dp[i][j]!=-1) return dp[i][j];
        int f=w[i]*year+Wine_Profit(w,i+1,j,year+1,dp);
        int l=w[j]*year+Wine_Profit(w,i,j-1,year+1,dp);
        return dp[i][j]=Math.max(f,l);
    }


//    public static int Wine_BU(int[] w){
//        int year=w.length;
//        int [][] dp=new int[w.length][w.length];
//        for(int i=0;i< dp.length;i++){
//            dp[i][i]=w[i]*year;
//        }
//        year--;
//        for (int slide = 1; slide <dp.length ; slide++) {
//            for (int j = slide; j < dp.length; j++) {
//                int i=j-slide;
//                int f=w[i]*year+dp[i+1][j];
//                int l=w[j]*year+dp[i][j-1];
//            dp[i][j]= Math.max(f,l);
//            }
//            year--;
//        }
//        return dp[0][dp.length-1];
//
//    }

}
