public class quick_sort {
    public static void main(String[] args) {
        int [] a={5,7,2,3,8,9,1,4};
        sort(a,0,a.length-1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void sort(int []a,int si,int ei){
        if(si>=ei)
                return;
        int pi=partition(a,si,ei);
        sort(a,si,pi-1);
        sort(a,pi+1,ei);
    }
    public static int partition(int []a,int si,int ei){
        int it=a[ei];
        int pi=si;
        for (int i = si; i <ei ; i++) {
            if(a[i]<=it){
                int t=a[i];
                a[i]=a[pi];
                a[pi]=t;
                pi++;
            }
        }
        int t=a[pi];
        a[pi]=a[ei];
        a[ei]=t;
        return pi; // return index of element 4
    }
}
