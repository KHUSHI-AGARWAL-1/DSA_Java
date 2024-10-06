public class merge_2_sorteda_arrays {
    public static void main(String[] args) {
        int [] a={1,3,5,7,9};
        int []b={2,3,7,9,11,13,15};
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
        for(int p=0;p<c.length;p++){
            System.out.print(c[p]+" ");
        }
    }
}
