import java.util.ArrayList;
import java.util.List;
public class CoinTargetSum {

  public static void main(String[] args) {
////        1. without array
//      int amt=10;
//        Print(amt,0,"");
//        2. with array
        int [] coin={4,2,1};
        int amt=5;
      System.out.println( print1(coin, amt,""));
//

   }
   //without array:
    // public static void Print(int amt,int sum, String ans){
//        if(sum==amt){
//            System.out.println(ans);
//            return;
//        }
//        if(sum>amt)
//            return;
//        Print(amt,sum+2,ans+"2");
//        Print(amt,sum+3,ans+"3");
//        Print(amt,sum+5,ans+"5");
//    }
    public static int print1(int [] coin, int amt, String ans){
      int s=0;
        if(amt==0)
        {

           System.out.println(ans);
            return 1;
        }
        for (int i = 0; i < coin.length; i++) {
            if(amt>=coin[i]){
              s= s+  print1(coin,amt-coin[i],ans+coin[i]);
            }

        }
        return s;
  }
}


