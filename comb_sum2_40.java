import java.util.ArrayList;
import java.util.List;

public class comb_sum2_40 {
    public static void main(String[] args) {
        int [] c={10,1,2,7,6,1,5};
                int t=8;
        List<Integer> ll=new ArrayList<>();
       List< List<Integer>> ans=new ArrayList<>();
       print1(c,t,ll,0,ans);
        System.out.println(ans);
    }

    public static void print1(int[] coin, int amt, List<Integer> ll, int idx, List<List<Integer>> ans) {
        if (amt == 0) {
            ans.add(new ArrayList<>(ll));
            return;
        }
        for (int i = idx; i < coin.length; i++) {
            if(i==idx || coin[i]!=coin[i-1]) {
                if (amt >= coin[i]) {
                    ll.add(coin[i]);

                    print1(coin, amt - coin[i], ll, i + 1, ans);
                    ll.remove(ll.size() - 1);
                }

            }
        }
    }
}

