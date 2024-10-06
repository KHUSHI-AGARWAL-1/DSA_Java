package BitMasking;

import java.util.*;

public class Tavas_and_SaDDas {
    //You are given a lucky number n. Lucky numbers are the positive integers whose decimal representations contain only the
    // lucky digits 4 and 7. For example, numbers 47, 744, 4 are lucky and 5, 17, 467 are not.
//    Input :4
//    Output:1
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        System.out.println(Index(str));
    }
    public static int Index(String str){
        int n=str.length();
        int x=(1<<n)-2; //`n-1 tk ke saare lucky number ka count
        int y=0; int pos=0;
        for (int i = n-1; i >= 0;i--) {
            if(str.charAt(i)=='7'){
                y=y+(1<<pos); //y=2^1+2^2+2^3....
            }
            pos++;
        }
        return x+y+1;
    }

}
