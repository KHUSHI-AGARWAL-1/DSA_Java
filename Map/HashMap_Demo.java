package Map;

import java.util.*;

public class HashMap_Demo {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        //ADD
        map.put("Raj",87);
        map.put("Ankita",99);
        map.put("Khushi",98);
        map.put("Amit",65);
        map.put("Priya",99);
        map.put("Hina",50);
        map.put("Ankit",78);
        map.put("Jays",90);
//        map.put(null,55);
        System.out.println(map);

        //GET
//        System.out.println(map.get("Ankit")); //value present
//        System.out.println(map.get("kashish")); //value not present thn null

        //REMOVE
//        System.out.println(map.remove("kashish"));
//        System.out.println(map.remove("Ankit"));
//        System.out.println(map);

        //CONTAINS (koi key ki entry h ya nhi)
//        System.out.println(map.containsKey("Kunal"));
//        System.out.println(map.containsKey("Raj"));

        //TreeMap

        TreeMap<String,Integer> map1=new TreeMap<>();
        //ADD
        map1.put("Raj",87);
        map1.put("Ankita",99);
        map1.put("Khushi",98);
        map1.put("Amit",65);
        map1.put("Priya",99);
        map1.put("Hina",50);
        map1.put("Ankit",78);
        map1.put("Jays",90);
//        map1.put(null,45); invalid
        System.out.println(map1);

        LinkedHashMap<String,Integer> map2=new LinkedHashMap<>();
        map2.put("Raj",87);
        map2.put("Ankita",99);
        map2.put("Khushi",98);
        map2.put("Amit",65);
        map2.put("Priya",99);
        map2.put("Hina",50);
        map2.put("Ankit",78);
        map2.put("Jays",90);
        map2.put(null,55);  //valid
        System.out.println(map2);

        //traversal of map....using keySet()
        Set<String>key=map.keySet();
        for(String k:key){
            System.out.println(k+" "+map.get(k));
        }

    }
}
