public class grid_rec {
    public static void main(String[] args) {
        int n=2;
        int m=2;
        int cc=0;
        int cr=0;



        System.out.print(path(n,m,cc,cr,""));


    }
    public static int path(int n, int m,int cc,int cr,String ans){
        if(cc==m-1 && cr==n-1){
            System.out.print(ans+" ");

//            return;
            return 1;
        }
        if(cc>=m || cr>=n)
//            return;
                return 0;
      int a=   path(n,m,cc,cr+1,ans+"V");

        int b= path(n,m,cc+1,cr,ans+"H");

        return a+b;
    }
}
