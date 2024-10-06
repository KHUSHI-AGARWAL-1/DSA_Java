public class check_prime {
    public static void main(String[] args) {
        int n=2;
        System.out.println(prime(n));

    }
    public static boolean prime(int n){
        int div=2;
        while(div *div <=n){
            if(n%div==0)
                return false;
            div++;

        }
        return true;
    }
}
