package String_Pol_func;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pattern_Find {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            String s=sc.next();
            String p = sc.next();
            pattern(s,p);
        }
    }
//rabin karp algo
    private static void pattern(String st, String s) {
        long mod = 1000_000_007;
        long pow = 1;
        long p = 31;
        long hv = 0;
        for (int i = 0; i < s.length(); i++) { // jo substring find krnni h uska hashcode nikall lenge
            int pos = s.charAt(i) - 'A' + 1;
            hv = (hv + (pos * pow) % mod) % mod;
            pow = (pow * p) % mod;
        }
        long []dp = new long[st.length()];  // strting se letter ka hashcode store
        long [] pa = new long[st.length()]; // pow k track === p^0  ,  p^1 ,  p^2....
        dp[0]= st.charAt(0)-'a'+1; // 1st character ka hashcode
        pa[0]=1;
        pow=31;
        for (int i = 1; i <st.length() ; i++) {
            dp[i]= (dp[i-1]+ ((st.charAt(i)-'a'+1)*pow)%mod);
            pa[i]= pow;
            pow= (pow*p)%mod;
        }
        List<Integer> ll= new ArrayList<>();
        for(int ei=s.length()-1,si=0;ei<st.length()-1 ;ei--,si++){
            long curr=dp[ei];
            if(si>0){
                curr-=dp[si-1];
                curr=(curr+mod)%mod;
            }
            if(curr==(hv*pa[si]%mod)){
                ll.add(si+1);
            }
        }
        if(ll.size()==0){
            System.out.println("Not Found");
        }
        else{
            System.out.println(ll.size());
            for (int v:ll) {
                System.out.print(v+" ");
            }
            System.out.println();
        }
    }
}
