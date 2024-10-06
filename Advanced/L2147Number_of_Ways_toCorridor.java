package Advanced;

public class L2147Number_of_Ways_toCorridor {
    public static void main(String[] args) {
        String s= "SSPPSPS";
        System.out.println(number(s));
    }
    public static int number(String s){
        int ts=0; //totalseat
        int seat=0; int plant=0;
        int ans=0;
        int mod=1000_000_007;
        boolean div=false; //divider

        for (int i = 0; i <s.length(); i++) {
            if(s.charAt(i)=='S'){
                ts++;
                seat++;
            }
            else if(seat==0){
                plant++;
            }
            //ans bnega jn seat==2
            if(seat==2){
                if(div==false){
                    div=true;

                }
                else{
                    ans= (ans*(plant+1))%mod;
                }
                seat=0;
                plant=0;
            }
        }
        if(ts==0 || ts%2!=0) return 0;
        return ans;
    }
}
