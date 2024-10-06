package Dynamic_Programming;

public class Uncrossed_LinesL1035 {
    public static void main(String[] args) {
        int[] s1={1,4,2};
        int[] s2={1,2,4};
        System.out.println(Lines(s1,s2));
    }
    public static int Lines(int[] s1,int[] s2){
        int [][]dp=new int[s1.length+1][s2.length+1];
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                int ans=0;
                if(s1[i-1]==s2[j-1]){
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
