package BitMasking;

// n =1000 arr=[2,3,5] we need to find uniques count of number tht are divisible by 2,3,5. we will do set operation i.e.AUB=A+B+  A intersection B
public class Avengers_EndGame {
    public static void main(String[] args) {
        int[] arr={2,3,5};
        int n=1000;

    }
    public static int Count(int[] prime,int n){
        int len=prime.length;
        int ans=0;
        for (int i = 1; i <(1<<len) ; i++) {
            if((Count_optimised(i)&1)!=0){
               ans+=InterSection(prime,n,i);
            }
            else {
                ans-=InterSection(prime,n,i);
            }
        }
        return ans;
    }

    private static int InterSection(int[] prime, int n, int i) {
          int p=1;
          int pos=0;
          while(i>0){
              if((i&1)!=0){
                  p*=prime[pos];
              }
              pos++;
              i>>=1;
          }
          return n/p;
    }

    public static int Count_optimised(int n){
        int c=0;
        while(n>0){
            n=(n&(n-1));
            c++;
        }
        return c;
    }
}
