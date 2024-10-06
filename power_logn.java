public class power_logn {
    // complexity is log n
    public static void main(String[] args) {
        int a=25;
        double b=0.5;
        System.out.println(pow(a,b));
    }
    public static double pow(int x, double n) {
        if(n==0) {
            return 1;
        }

         double ans = pow(x, n-1);
        return ans*x;

    }
}
