import java.util.ArrayList;
import java.util.List;

public class lexicographical_counting_rec {
    public static void main(String[] args) {
        int n=10;

        List<Integer> curr1=new ArrayList<>();
        count(0,n,curr1);
        System.out.println(curr1);
    }
    public static void count(int curr,int n,List<Integer> curr1){
       if(curr>n){
           return;
       }
//        System.out.println(curr);
        curr1.add(curr);
        int i=0;
        if(curr==0){
            i=1;
        }
        for (; i <=9 ; i++) {
            count(curr*10+i,n,curr1);
        }
    }
}
