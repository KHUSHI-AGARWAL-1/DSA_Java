package BitMasking;

import java.util.*;

public class Preparing_Olympiad {
    //You have n problems. You have estimated the difficulty of the i-th one as integer ci. Now you want to prepare a problemset for a contest,
    // using some of the problems you've made.A problemset for the contest must consist of at least two problems. You think that the total
    // difficulty of the problems of the contest must be at least l and at most r. Also, you think that the difference between difficulties of
    // the easiest and the hardest of the chosen problems must be at least x.
    //Find the number of ways to choose a problemset for the contest.
    //input=3 5 6 1
    //1 2 3
    //output : 2

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int l=sc.nextInt();
        int r=sc.nextInt();
        int x=sc.nextInt();
        int[] c= new int[n];
        for (int i = 0; i < c.length; i++) {
            c[i]= sc.nextInt();
        }
        System.out.println(count(c,l,r,x));
    }
    public static long count(int[]c,int l,int r,int x){
        int n= c.length;
        int ans=0;
        for (int i = 3; i < (1<<n); i++) {
            if(countSetBit(i)>=2 && ispossible(c,i,l,r,x)){
            ans++;
            }
        }
        return ans;
    }

    private static boolean ispossible(int[] c, int i, int l, int r, int x) {
    long sum=0;
    int min= Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
    int pos=0;
        while(i>0){
            if((i&1)!=0){
        sum+=c[pos];
        min=Math.min(min,c[pos]);
        max=Math.max(max,c[pos]);
            }
            pos++;
            i>>=1;
        }
        return sum>=l & sum<=r & max-min>=x;
    }
    public static int countSetBit(int n){
        int c=0;
        while(n>0){
            n=(n&(n-1));
            c++;
        }
        return c;
    }
}
