package Advanced;

import java.util.LinkedList;

public class Median_of2_sortedArray {
    public static void main(String[] args) {
    }
    public static double Median(int[] arr1,int[] arr2){
        int lo=0;
        int hi=arr1.length;
        int n= arr1.length;
        int m = arr2.length;
        while(lo<=hi){
            int c1=(lo+hi)/2;
            int c2=(n+m+1)/2;
            int l1=c1==0?Integer.MIN_VALUE:arr1[c1-1];
            int l2=c2==0?Integer.MIN_VALUE:arr2[c2-1];
            int r1=arr1[c1];
            int r2= arr2[c2];
            if(l1<=r2 && l2<=r1){
                if((n+m)%2==0){
                    return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                }
                else {
                    return Math.max(l1, l2);
                }
            }
            else if(l1>r2){
                hi=c1-1;
            }
            else{
                lo=c1+1;
            }
        }
return 0.0;
    }
}
