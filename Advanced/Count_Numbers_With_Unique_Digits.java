package Advanced;
//LeetCode 357
public class Count_Numbers_With_Unique_Digits {
    public static void main(String[] args) {
        int n =2;
        System.out.println(Unique(n));
    }
    public static int Unique(int n){
        if(n==0)
            return 1;
        int c=9;
        for (int i = 2; i <=n ; i++) {
            c=c*(11-i); //if n=2 then 9+2=11 or n=3 then 3+8=11
            //so 11-i = the num of choice left for particular n
        }
        return c+Unique(n-1);
    }
}
