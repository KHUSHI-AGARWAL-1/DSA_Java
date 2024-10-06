package Map;

import java.util.*;

public class HashSet_Demo {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(4);
        set.add(41);
        set.add(30);
        set.add(2);
        set.add(11);
        set.add(-4);
        System.out.println(set);
//        System.out.println(set.contains(4));
//        System.out.println(set.contains(409));
//        System.out.println(set.remove(11)); //returns true if value present else false
//        System.out.println(set);
//        System.out.println(set.size());

        //TREESET
        TreeSet<Integer> set1=new TreeSet<>();
        set1.add(4);
        set1.add(41);
        set1.add(30);
        set1.add(2);
        set1.add(11);
        set1.add(-4);
        System.out.println(set1);


        //LINKEDHASHSET
        LinkedHashSet<Integer> set2=new LinkedHashSet<>();
        set2.add(4);
        set2.add(41);
        set2.add(30);
        set2.add(2);
        set2.add(11);
        set2.add(-4);
        System.out.println(set2);

        for(int val:set){
            System.out.print(val+" ");
        }
    }
}
