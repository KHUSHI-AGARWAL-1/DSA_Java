public class interview {
    public static void main(String[] args) {
        int[] a={3,1,5,8,7,2,9};
//        int[] b={3,1,5,2};
        int l=0;
        int h=a.length;
        System.out.println(mergesort(a,l,h));

    }
    public static int[] mergesort(int[] a,int l,int h){
      if(a.length==0){
          int[]d= new int[1];
          d[0]=l;
      }
        int m=(h+l)/2;
        int[] b= mergesort(a,0,m);
        int [] c=mergesort(a,m+1,h);
        return merge(b,c);
    }
    public static int[] merge(int []a,int[]b){
        int l1=a.length;
        int l2=b.length;
        int [] c=new int[l1+l2];
                int i=0;
        int j=0;
        int k=0;
        while(i<j){
            if(a[i]<b[j]){
                c[k]=a[i];
                k++;
                i++;
            }
            else{
                c[k]=b[j];
                j++;
                k++;
            }
        }
        while(i<j){
            if(a[i]<b[j]){
                c[k]=a[i];
                k++;
                i++;
            }
        }
        return c;
    }
}
