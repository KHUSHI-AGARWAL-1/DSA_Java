package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Intersection_of_2arrays_L350 {
    public static void main(String[] args) {
        int [] a1={4,9,5};
        int []a2={9,4,9,8,4};
int []ans=intersection(a1,a2);
        for (int i = 0; i <ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] intersection(int[] a1,int[] a2){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <a1.length ; i++) {
            if(map.containsKey(a1[i])){
               map.put(a1[i],map.get(a1[i])+1);
            }
            else{
                map.put(a1[i],1);
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < a2.length; i++) {
            if(map.containsKey(a2[i])&&map.get(a2[i])>0){
                list.add(a2[i]);
                map.put(a2[i],map.get(a2[i])-1);
            }
        }
        int[] ans=new int[list.size()];
        for(int i=0;i< list.size();i++){
            ans[i]= list.get(i);
        }
        return ans;
    }
}
