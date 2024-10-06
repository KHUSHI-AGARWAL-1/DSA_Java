package Map;

import java.util.HashMap;

public class Longest_Consecutive_SequenceL128 {
    public static void main(String[] args) {
        int [] nums= {0, 3, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i]-1)){
                map.put(nums[i],false);
            }
            else{
                map.put(nums[i],true);
            }
            if(map.containsKey(nums[i]+1)){
                map.put(nums[i]+1,false);
            }
            }
        int ans=0;
        for(int key:map.keySet()){
            if(map.get(key)){
                int count=0;
                while (map.containsKey(key)){
                    count++;
                    key++;
                }
                ans=Math.max(ans,count);

            }
        }

        return ans;
        }
}
