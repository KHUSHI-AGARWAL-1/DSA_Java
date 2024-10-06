//
import java.util.*;
import java.util.Stack;

public class extra {
    //    static int c = 0;
    public static void main(String args[]) {
//        // Your Code Here
        Stack<Integer> st= new Stack<>();
        for (int i = 0; i < 5; i++) {
            st.push(i);

        }
        kk(st,3);
//        Scanner sc  = new Scanner(System.in);
//
//        int[][] points = {{1, 1}, {2, 3}, {3, 2}};
//        int n= sc.nextInt();
//        int[]arr=new int[n];
//        for (int i = 0; i <n ; i++) {
//            arr[i]=sc.nextInt();
//
//        }
//        check(arr,n);
//        System.out.println(isBoomerang(points));
    }
public static void kk(Stack <Integer>st, int q){
    Stack<Integer> A= new Stack<>();
    Stack<Integer> B=new Stack<>();
    ArrayList<Integer> kll=new ArrayList<>();
//    find(kll);
    for(int i=0;i<q;i++){
        int p= kll.get(i);
    while (!st.isEmpty()){
        int b= st.pop();
        if(b%p==0)
            B.push(b);
        else
            A.push(b);
    }
    while(!B.isEmpty()){
        System.out.println(B.pop());
    }
    st=A;
    A= new Stack<>();

    }
    while(!A.isEmpty()){
        System.out.println(A.pop());
    }
}
    ////    static int co=0;
////    //{0-0}K{2-1}R{2-2} {0-0}K{1-2}R{2-2} {0-0}R{0-1}K{2-2} {0-0}R{0-1}R{0-2}R{1-2}R{2-2} {0-0}R{0-1}R{0-2}R{2-2} {0-0}R{0-1}R{1-1}B{2-2} {0-0}R{0-1}R{2-1}R{2-2} {0-0}R{0-2}R{1-2}R{2-2} {0-0}R{0-2}R{2-2} {0-0}R{1-0}K{2-2} {0-0}R{1-0}R{1-1}B{2-2} {0-0}R{1-0}R{1-2}R{2-2} {0-0}R{1-0}R{2-0}R{2-1}R{2-2} {0-0}R{1-0}R{2-0}R{2-2} {0-0}R{2-0}R{2-1}R{2-2} {0-0}R{2-0}R{2-2} {0-0}B{1-1}B{2-2} {0-0}B{2-2}
////    public static void knight(int n,int r,int c, String ans){
////        // base case {0-0}K{2-1}R{2-2}
////        if(r==n-1 && c==n-1){
////            System.out.print(ans+ "{" +r+"-"+c+"}"+" ");
////            co++;
////            return;
////        }
////        if(r>=n || c>= n){
////            return;
////        }
////        // knight
////
////
////        knight(n,r+2,c+1,ans+"{" +r+"-"+c+"}K");
////        knight(n,r+1,c+2,ans+"{" +r+"-"+c+"}K");
////        if(r==0|| c==0|| r==n-1|| c==n-1) {
////            for (int i = c + 1; i <= n; i++) {
////                knight(n, r, i, ans + "{" + r + "-" + c + "}R");
////            }
////            for (int i = r + 1; i <= n; i++) {
////                knight(n, i, c, ans + "{" + r + "-" + c + "}R");
////            }
////
////        }
////        if(r==c || r+c==n-1){
////            for(int i=r+1,j=c+1;i<=n && j<=n;i++,j++){
////                knight(n,i,j,ans+"{" +r+"-"+c+"}B");
////            }
////        }
////
////
////    }
////    2. mazepath
////    public static int path(int n, int m, String ans, int cr, int cc){
////        if(cr==n-1 && cc==m-1){
////            System.out.print(ans+" ");
////            return 1;
////        }
////        if(cr>=n || cc>=m)
////        {
////            return 0;
////        }
////    int  a= path(n,m,ans+"V",cr+1,cc);
////       int b=  path(n,m,ans+"H",cr,cc+1);
////        return a+b ;
////    }
//    // VVHH VHVH VHHV HVVH HVHV HHVV
////    public static void path(int k,int o,int c,String ans){
////        // base
////        if(o==k && c==k){
////            System.out.println(ans+" ");
////            return;
////        }
////
////        if(c<o){
////            path(k,o,c+1,ans+")");
////        }
////        if(o<k){
////            path(k,o+1,c,ans+"(");
////        }
//public static void check(int[][] arr,int n){
//    int ce=0;
//    for (int i = 0; i <n ; i++) {
//        for (int j = 0; j <n ; j++) {
//            if(arr[ce][i]==1){
//                ce=i;
//            }
//        }
//
//    }
//    }
//}
    public static boolean isBoomerang(int[][] points) {
        int x1 = points[0][0];
        int y1 = points[0][1];
        int x2 = points[1][0];
        int y2 = points[1][1];
        int x3 = points[2][0];
        int y3 = points[2][1];
        double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));

        if (a + b == c || b + c == a || a + c == b)
            return false;
        return true;
    }
}