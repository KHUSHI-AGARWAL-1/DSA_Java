//import java.util.Scanner;
//
//public class Pattern_2lec {
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int n= sc.nextInt();
//        int n=4;
//        int row=1;
//        int sp=n-1;
//        int st=1;
//        while(row<=2*n-1);
//        {
//            int i=1;
//            while(i<=sp){
//                System.out.print(" ");
//                i++;
//
//            }
//            int j=1;
//            while(j<=st){
//                System.out.print("*");
//                j++;
//
//            }
//            row++;
//            if(row<=n){
//                st++;
//                sp--;
//
//            }
//
//            else{
//            st--;
//            sp++;
//
//        }
//
//            System.out.println();
//        }
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sp = -1;
//        int st = n / 2 + 1;
//        int row = 1;
//        while (row <= 2 * n - 1) ;
//        {
//            int i = 1;
//            while (i <= st) {
//                System.out.print("* ");
//                i++;
//
//            }
//            int j = 1;
//            while (j <= sp) {
//                System.out.print("  ");
//                j++;
//            }
//            int k = 1;
//            if (row == 1 || row == n) {
//                k = 2;
//            }
//            while (k <= st) {
//                System.out.print(" *");
//                k++;
//            }
//            if (row <= n / 2) {
//                st = st - 1;
//                sp += 2;
//            } else {
//                st -= 2;
//                st++;
//
//            }
//            row++;
//            System.out.println();
//
//
//        }
//      pattern:25
//        int n=4;
//
//        int st = 1;
//        int sp = n - 1;
//        int val = 1;
//        int row = 1;
//        while (row <= n) {
//            int i=1;
//
//            while(i<=sp){
//                System.out.print("  ");
//                i++;
//
//            }
//            val = row;
//            int j=1;
//
//            while(j<=st){
//                System.out.print(val+" ");
//                val++;
//                j++;
//
//            }
//
//            val-=2;
//            int k=1;
//            while(k<=st-1){
//                System.out.print(val+" ");
//                val--;
//                k++;
//
//            }
//            int c = 1;
//            if (c <= st / 2)
//                val++;
//            else
//                val--;
//
//            System.out.println();
//            sp--;
//            st ++;
//            row++;
////        }
//    int n=4;
//    int row=1;
//    int sp=1;
//    int st=1;
//    int val=1;
//    while (row<=n){
//        int i=1;
//            while(i<=sp){
//                System.out.print(" ");
//                i++;
//
//            }
//            int j=1;
//            while(j<=st){
//                System.out.print("*");
//                j++;
//
//            }





//    }
//}
