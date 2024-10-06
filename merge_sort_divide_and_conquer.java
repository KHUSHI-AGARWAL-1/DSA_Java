public class merge_sort_divide_and_conquer {
    public static void main(String[] args) {
        int a[]={2,7,9,1,5};
      int []  ans= merge(a,0,a.length-1);
        for (int i = 0; i <ans.length ; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] merge(int []a,int si,int ei){
        if(si==ei){
            int bs[]=new int [1];
            bs[0]=a[si];
            return bs;
        }
        int mid=(si+ei)/2;
        int f[]=merge(a,si,mid);
        int []s=merge(a,mid+1,ei);
        return merge2(f,s);
    }
    public static int[]merge2(int[]a,int [] b){
        int n= a.length;
        int m= b.length;
        int [] c= new int [n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
                k++;
            }
            else{
                c[k]=b[j];
                j++;
                k++;
            }
        }
        while(i<n){
            c[k]=a[i];
            i++;
            k++;
        }
        while(j<m){
            c[k]=b[j];
            j++;
            k++;
        }
        return c;
    }
}
