public class prime_seive {
    public static void main(String[] args) {
        int n=60;
       prime(n);
    }
    public static void prime(int n){
        boolean [] a= new boolean [n+1];
        a[0]= true;
        a[1]=true;
        for(int i=2;i*i<=n;i++){
            if(a[i]==false){
                for(int j=2;i*j<=n;j++){
                    a[i*j]=true;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(a[i]==false){
                System.out.print(i+" ");
            }
        }

    }
}
