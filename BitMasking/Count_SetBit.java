package BitMasking;

public class Count_SetBit {
    //count num of 1 in bin. rep. of a num
    public static void main(String[] args) {
        int n=5;
        System.out.println(Count(n));
        System.out.println(Count_optimised(n));
    }
    public static int Count(int n){
        int c=0;
        while(n>0){
            if((n & 1) !=0){
                c++;
            }
            n>>=1;
        }
        return c;
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
