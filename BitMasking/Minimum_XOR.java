package BitMasking;

public class Minimum_XOR { //leetcode 2429
    //find a number X such that (X XOR A) is min and count of set bits in X and B are equal
    public static void main(String[] args) {
        int a=11;
        int b=125;
        System.out.println(Min_Val(a,b));
    }
    public static int Min_Val(int a ,int b){
        int c= CountSet(b);
        int x=0;
        for (int i = 31; i >=0 && c>0 ; i--) {
            if((a& (1<<i))!=0){
                x+=(1<<i);
                c--;
            }
        }
        for (int i = 0; i <=31 && c>0 ; i++) {
            if((a& (1<<i))==0){
                x+=(1<<i);
                c--;
            }
        }
        return x;
    }
    public static int CountSet(int b){
        int c=0;
        while(b>0){
            c++;
            b=(b & (b-1));
        }
        return c;
    }
}
