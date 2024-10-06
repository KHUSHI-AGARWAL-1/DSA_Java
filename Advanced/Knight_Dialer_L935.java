package Advanced;

public class Knight_Dialer_L935 {
    public static void main(String[] args) {
        int n = 2; int ans=0;
        int[][][] dp= new int[n][4][3];
        for (int i = 0; i <dp.length ; i++) {
            for (int j = 0; j <dp.length ; j++) {
                for (int k = 0; k < dp.length; k++) {
                    dp[i][j][k]=-1;
                }
            }
        }
        for(int i=0;i<4;i++){
            for (int j=0;j<3;j++){
                ans=ans+count(n-1,j,i,dp);
            }
            System.out.println(ans);
        }
    }
    public static int count(int n , int cc, int cr,int[][][]dp){
        if(cr<0 || cc<0 || cr>=4 || cc>=3 ||(cr==3 && (cc==0 || cc==2))){
            return 0;
        }
        if(n==0) return 1;
        if(dp[n][cr][cc]!=-1) return dp[n][cr][cc];
        int [] r= {-2,-2,-1,-1,1,1,2,2};
        int c[]={-1,1,-2,2,-2,2,-1,1};
        int ans=0;
        for (int i = 0; i <c.length ; i++) {
            ans=ans+count(n-1,cc+c[i],cr+r[i],dp);
        }
        return dp[n][cr][cc]= ans%1000_000_007;
    }
}
