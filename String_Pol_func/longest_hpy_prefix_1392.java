package String_Pol_func;

public class longest_hpy_prefix_1392 {
    public static void main(String[] args) {
        String s = "acccbaaacccbaac" ;
        System.out.println(Hpy_prefix(s));

    }
    public static String Hpy_prefix(String s){
        int []dp = new int[s.length()];
        int len = 0;
        for (int i = 1; i < dp.length ;) {
            if(s.charAt(i) == s.charAt(len)){
                len++;
                dp[i] =len;
                i++;
            }
            else {
                if (len>0)
                    len= dp[len-1];
                else
                    i++;
            }
        }
        return s.substring(0,len);
    }
}
