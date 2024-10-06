import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
//        int r=0;
//        int st=1;
//        while(r<n);
//        {
//            int i = 1;
//            int val = 1;
//            while (i < st) {
//                System.out.print(val + " ");
//                val = ((r - i) * val) / (i + 1);
//                i++;
//
//            }
//            st++;
//            System.out.println();
//            r++;
//        }
//
//    }
//}

        // pattern9:
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = 1;
        int star = 1;
        while (row <= n) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }

            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }

            space++;

            System.out.println();
            row++;

        }

    }

}
