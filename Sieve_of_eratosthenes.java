public class Sieve_of_eratosthenes {
    public static void main(String[] args) {
        int n=100;
        prime_seive(n);

    }
    public static void prime_seive(int n){
        boolean[] prime = new boolean[n+1];
        prime[0]=prime[1]=true; // true means non prime
        for (int i = 2; i*i < prime.length ; i++) {
            if(prime[i]==false){
                for (int j = 2; j *i< prime.length ; j++) {
                    prime[i*j]=true;
                }
            }

        }
        for (int i = 0; i < prime.length;  i++) {
            if(prime[i]==false)
                System.out.print(i+" ");
        }
    }
}
// complexity of prime no: n*log log(n)
// N{ 1/2+1/3+1/4+1/5.....1/sqrt(n)}
// if range is 1-100 thn it would go upto i/10

