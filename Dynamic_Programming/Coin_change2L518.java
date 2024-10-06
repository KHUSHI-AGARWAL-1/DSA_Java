package Dynamic_Programming;

public class Coin_change2L518 {
    public static void main(String[] args) {
        int[] coin={1,2,5};
        int amt=5;
//        int[][]dp=new int[amt+1][coin.length];
//        for (int i = 0; i < dp.length; i++) {
//            for (int j = 0; j < dp[0].length; j++) {
//                dp[i][j]=-1;
//            }
//        }
//        System.out.println(Coin_Change(coin,amt,0));
//        System.out.println(Coin_Change2(coin,amt,0,dp));
        System.out.println(Coin_ChangeBU(coin,amt));
    }
//    public static int Coin_Change(int[] coin,int amt,int i){
//        if(amt==0){
//            return 1;
//        }
//        if(i== coin.length){
//            return 0;
//        }
//        int inc=0;
//        int exc=0;
//        if(amt>=coin[i]){
//            inc=Coin_Change(coin,amt-coin[i],i);
//
//        }
//        exc=Coin_Change(coin,amt,i+1);
//        return inc+exc;

//    }
//public static int Coin_Change2(int[] coin,int amt,int i,int[][]dp) { //top down
//    if (amt == 0) {
//        return 1;
//    }
//    if (i == coin.length) {
//        return 0;
//    }
//    if (dp[amt][i] != -1)
//        return dp[amt][i];
//    int inc = 0;
//    int exc = 0;
//    if (amt >= coin[i]) {
//        inc = Coin_Change2(coin, amt - coin[i], i, dp);
//
//    }
//    exc = Coin_Change2(coin, amt, i + 1, dp);
//    return inc + exc;
//}
public static int Coin_ChangeBU(int[] coin,int amt) { //BOTTOM UP
        int[][] dp=new int[amt+1][coin.length+1];
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j]=1;
        }
    for (int am = 1; am < dp.length; am++) {
        for (int i = 1; i <dp[0].length ; i++) {
            int inc=0; int exc=0;
            if(am>=coin[i-1]){
                inc=dp[am-coin[i-1]][i];
            }
            exc=dp[am][i-1];
            dp[am][i]=inc+exc;
        }
    }
 return dp[dp.length-1][dp[0].length-1];
}
}

