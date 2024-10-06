package Advanced;
import java.util.*;
//You are given N elements, a1,a2,a3....aN. Find the number of good sub-arrays.
//A good sub-array is a sub-array [ai,ai+1,ai+2....aj] such that (ai+ai+1+ai+2+....+aj) is divisible by N.
//5
//4 5 0 -2 -3
//Output:6
// There are 6 subarrays with a sum divisible by N :
//[5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
public class Divisible_Subarray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++)
                arr[i]=scn.nextInt();
        System.out.println(NumOfSub(arr));
    }
    public static long NumOfSub(int[] arr){
        long[] freq= new long[arr.length];
        long sum=0;
        freq[0]=1;
        for (int i = 0; i < arr.length ; i++) {
            sum=sum+arr[i];
            int index= (int)(sum% arr.length);
            if(index<0){
                index+= arr.length;
            }
            freq[index]++;
        }
        long c=0;
        for (int i = 0; i < freq.length ; i++) {
            long p=freq[i];
            if(p>=2){
                c+=(p*(p-1))/2; //nC2 ka formula= n*n-1 /2
            }
        }
        return c;
    }
}
