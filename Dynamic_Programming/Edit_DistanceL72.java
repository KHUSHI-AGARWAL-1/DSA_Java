package Dynamic_Programming;

public class Edit_DistanceL72 {
    public static void main(String[] args) {
        String s1="horse";
        String s2="ros";
        System.out.println(dist(s1,s2,0,0));
    }
//i-> s1 j->s2
    public static int dist(String s1, String s2,int i,int j) {
        if(i==s1.length()){
            return s2.length()-j;
        }
        if(j==s2.length()){
            return s1.length()-i;
        }
        int ans=0;
        if(s1.charAt(i)==s2.charAt(j)){
            ans=dist(s1,s2,i+1,j+1);
        }
        else{
            int del=dist(s1,s2,i+1,j);
            int repl=dist(s1,s2,i+1,j+1);
            int ins=dist(s1,s2,i,j+1);
            ans=Math.min(del,Math.min(repl,ins))+1;
        }
        return ans;
    }
}
