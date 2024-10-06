package Dynamic_Programming;

public class Distinct_SubsequenceL115 {
    public static void main(String[] args) {
        String s="rabbbit"; //s->coin[]
        String t="rabbit"; //t->amt
        int[][]dp=new int[s.length()+1][t.length()+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j]=-1;
            }
        }
        System.out.println(Distinct_subsequence(s,t,0,0,dp));
    }


    public static int Distinct_subsequence(String s,String t,int i,int j,int[][]dp) { //BOTTOM UP  i->s ka index j-> t ka index
        if(j==t.length()){
            return 1;
        }
        if(i==s.length()){
            return 0;
        }
if(dp[i][j]!=-1){
    return dp[i][j];
}
        int inc=0,exc=0;
        if(s.charAt(i)==t.charAt(j)){
            inc=Distinct_subsequence(s,t,i+1,j+1,dp);

        }
        exc=Distinct_subsequence(s,t,i+1,j,dp);// discard m amount to vhi rhega bs coin bdega
        return dp[i][j]= inc+exc;





    }
}
