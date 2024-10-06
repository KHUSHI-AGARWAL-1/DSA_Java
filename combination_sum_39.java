
import java.util.ArrayList;
import java.util.List;

public class combination_sum_39 {
    public static void main(String[] args) {
        int [] a={2,3,6,7};
        int amt=7;
        List<Integer> ll=new ArrayList<>();
        print1(a, amt,ll,0,"");
    }
    public static void print1(int [] coin, int amt, List<Integer>ll,int idx,String ans){
        if(amt==0)
        {
//           ans.add(new ArrayList<>(ll));
            return;
        }
        for (int i = idx; i < coin.length; i++) {
            if(amt>=coin[i]){
                ll.add(coin[i]);

                print1(coin,amt-coin[i],ll,i,ans);
                ll.remove(ll.size()-1);
            }

        }
        System.out.println(ans);
    }
}
