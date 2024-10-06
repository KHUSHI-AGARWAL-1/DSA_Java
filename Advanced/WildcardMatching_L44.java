package Advanced;

public class WildcardMatching_L44 {
    public static void main(String[] args) {
        String s="aa";
        String p="?*";
        boolean[][] dp = new boolean[s.length()+1][p.length()+1];
        System.out.println(Matching(s,p,0,0,dp));
    }
 public  static boolean Matching(String s,String p, int i,int j, boolean[][] dp){
        //i-p j-s
     if(j==s.length()){
         for (int k = i; k <p.length() ; k++) {
             if (p.charAt(k)!='*'){
                 dp[i][j]=false;
                 return false;
             }

         }
         dp[i][j]=true;
         return true;
     }
     if (i==p.length()){
         dp[i][j]=false;
         return false;
     }
     boolean ans= false;
     if(s.charAt(j)==p.charAt(i)|| p.charAt(i)=='?'){
         ans=Matching(s,p,i+1,j+1,dp);
     }
     else if (p.charAt(i)=='*'){
         boolean match = Matching(s,p,i,j+1,dp);
         boolean dont = Matching(s,p,i+1,j,dp);
         ans= match || dont;
     }
     return dp[i][j]= ans;
 }

}
