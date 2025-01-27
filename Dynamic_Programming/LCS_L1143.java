package Dynamic_Programming;

import java.util.Arrays;

public class LCS_L1143 {
    public static void main(String[] args) {
        String s1="abcde";
        String s2="ace";
//        System.out.println(LCS(s1,s2,0,0));
//        int[][] dp=new int[s1.length()+1][s2.length()+1];
//        for(int []a:dp){
//            Arrays.fill(a,-1); //2d m fill loop m lg kr hoga kyuki fill 1d ke liye hota h
//        }
//        System.out.println(LCSTD(s1,s2,0,0,dp));
        System.out.println(LCSBU(s1,s2));
    }
    //i->s1,j->s2
//    public static int LCS(String s1,String s2,int i ,int j){
//        if(i==s1.length()|| j==s2.length()){
//            return 0;
//        }
//        int ans=0;
//        if(s1.charAt(i)==s2.charAt(j)){
//            ans=1+LCS(s1,s2,i+1,j+1);
//
//        }
//        else {
//            int fs=LCS(s1,s2,i+1,j);
//            int ss=LCS(s1,s2,i,j+1);
//            ans=Math.max(fs,ss);
//        }
//        return ans;
//    }

//    public static int LCSTD(String s1,String s2,int i ,int j,int[][] dp){
//        if(i==s1.length()|| j==s2.length()){
//            return 0;
//        }
//        if(dp[i][j]!=-1){
//            return dp[i][j];
//        }
//        int ans=0;
//        if(s1.charAt(i)==s2.charAt(j)){
//            ans=1+LCSTD(s1,s2,i+1,j+1,dp);
//
//        }
//        else {
//            int fs=LCSTD(s1,s2,i+1,j,dp);
//            int ss=LCSTD(s1,s2,i,j+1,dp);
//            ans=Math.max(fs,ss);
//        }
//        return dp[i][j]= ans;
//    }
    public static int LCSBU(String s1,String s2){
        int [][]dp=new int[s1.length()+1][s2.length()+1];
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                int ans=0;
        if(s1.charAt(i-1)==s2.charAt(j-1)){
            ans=1+dp[i-1][j-1];

        }
        else {
            int fs=dp[i-1][j];
            int ss=dp[i][j-1];
            ans=Math.max(fs,ss);
        }
      dp[i][j]= ans;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }

}
