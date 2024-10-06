package String_Pol_func;

import java.util.Scanner;
//KMP ALGO
public class Needle_NHAY_spoj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            String p= sc.next(); //pattern
            String t= sc.next(); //text string
            KMP(p,t);
        }
    }
    public static void KMP(String p,String t){
        String s = p+"#"+t;
        int []dp = new int[s.length()];
        int len = 0;
        for (int i = 1; i < dp.length ;) {
            if(s.charAt(i) == s.charAt(len)){
                len++;
                dp[i] =len;
                i++;
            }
            else {
                if (len>0) {
                    len = dp[len - 1];
                }
                else {
                    i++;
                }
            }
        }
        for (int j = p.length(); j <dp.length ; j++) {
                if(dp[j]==p.length())
            System.out.println(j-(2*p.length()));

        }

    }
}
