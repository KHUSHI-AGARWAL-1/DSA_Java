package Dynamic_Programming;

import java.util.Arrays;

public class LIS_L300 {
    public static void main(String[] args) {
        int[] ar={10,9,2,5,3,7,101,18};
        System.out.println(LIS(ar));
    }
    public static int LIS(int[] ar){
        int [] dp=new int [ar.length];
        Arrays.fill(dp,1);
        for(int i=1;i<dp.length;i++){
            for (int j = i-1; j >=0 ; j--) {
                if(ar[j]<ar[i]){
                    int a=dp[j]+1;
                    dp[i]=Math.max(dp[i],a);
                }
            }
        }
        int max=dp[0];
        for (int i = 1; i <dp.length ; i++) {
            if(max<dp[i]){
                max=dp[i];
            }
        }
        return max;
    }
}



