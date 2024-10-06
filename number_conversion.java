public class number_conversion {
    public static void main(String[] args) {
////            1. decimal to binary
//
//        int n=37;
//        int s=0;
//        int m=1;
//        while(n>0)
//        {
//            int rem=n%2;
//            s=s+m*rem;
//            n=n/2;
//            m=m*10;
//        }
//        System.out.println(s);

//        note:  if to convert any base into other than firstly one base should be 10 and modulo and divison should be from
//        destination base and multiply should be with src base
//          ex: convert 1111 from base 2 to base 10.

        int n=1111;
        int s=0;
        int m=1;
        while(n>0)
        {
            int rem=n%10;
            s=s+m*rem;
            n=n/10;
            m=m*2;
        }
        System.out.println(s);

    }
}
