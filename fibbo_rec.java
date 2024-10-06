public class fibbo_rec {
    public static void main(String[] args) {
        int n=6;
        System.out.println(fibbo(n));
    }
    public static int fibbo(int n){
        if(n==0 || n==1)
            return n;
        int f1=fibbo(n-1);
        int f2=fibbo(n-2);
        return f1+f2;
    }
}
