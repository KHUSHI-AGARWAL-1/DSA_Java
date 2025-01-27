package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Group_AnagramL49 {
    public static void main(String[] args) {
        String[] arr={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(arr));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for (int i=0;i< strs.length;i++){
            String key= Key(strs[i]);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(strs[i]);
        }
        List<List<String>> ans=new ArrayList<>();
        for (String key:map.keySet()){
            ans.add(map.get(key));
        }
        return ans;
    }

    public  static String Key(String str) {
        int freq[]=new int [26];
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            freq[ch-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < freq.length; i++) {
            sb.append(freq[i]);
        }
        return sb.toString();
    }
}
