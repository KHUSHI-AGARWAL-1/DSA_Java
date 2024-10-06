package Advanced;

public class L2040_Kth_SmallestProduct_SortedArrays {

    public static void main(String[] args) {
        int[] a1={-4,-2,0,3};
        int[] a2={2,4};
        int k=6;

    }
    public static  long Two_Sorted_Arrays(int[] a1,int[] a2,int k){
        long lo=-1000_000_0000l;
        long hi=1000_000_0000l;
        long ans=0;
        while (lo<=hi){
            long mid=(lo+hi)/2;
            if(countprod(a1,a2,mid)>=k){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }

    private static long countprod(int[] a1, int[] a2, long dot_prod) {
        long ans=0;

        for (int e1: a1) {
            int c=0;
            if(e1>=0){
                int lo=0;
                int hi= a2.length-1;

                while(lo<=hi){
                    int mid=(lo+hi)/2;
                    if((long)e1*a2[mid]<=dot_prod){
                        c=mid+1;
                        lo=mid+1;
                    }
                    else {
                        hi=mid-1;
                    }
                }
                ans+=c;
            }
            else{
                int lo=0;
                int hi= a2.length-1;
                while(lo<=hi){
                    int mid=(lo+hi)/2;
                    if((long)e1*a2[mid]<=dot_prod){
                        c=a2.length-mid; //peeche se count krenge
                        hi=mid-1;
                    }
                        else {
                            lo=mid+1;
                    }
                    }
                ans+=c;
            }
        }
        return ans;
    }
}
