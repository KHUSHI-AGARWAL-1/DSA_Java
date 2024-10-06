package Dynamic_Programming;

import java.util.Arrays;

//It's Valentine's Day in Russia today. as we all know number of girls in Russia is more than
// number of boys hence boys have an extra advantage while choosing girl for the valentine evening.
// Each boy has certain number of chocolates and each girl has certain number of candies.
// Now you being the anchor of evening wants to pair all the boys with girls such that sum of
// absolute difference between boy's chocolate and girl's candy in a pair is minimized.
// Ofcourse some of the girls will remain unpaired
public class Valentine_Magic {
    public static void main(String[] args) {
        int boys[] ={2,11,3};
        int [] girls={5,7,3,2};
        int[][]dp=new int[boys.length+1][girls.length+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j]=-1;
            }
        }
        Arrays.sort(boys);
        Arrays.sort(girls);
        System.out.println(magic(boys,girls,0,0,dp));
    }
    public static int magic(int [] boys,int[] girls,int i,int j,int[][]dp){
        if(i== boys.length){
            return 0;
        }
        if(j==girls.length){
            return 9999999;
        }
        if(dp[i][j]!=-1)
            return dp[i][j];
        int pair=Math.abs(boys[i]-girls[j])+magic(boys,girls,i+1,j+1,dp);
        int no_pair=magic(boys,girls,i,j+1,dp);
        return dp[i][j]=Math.min(pair,no_pair);
    }



}

