package Map;

public class Map_Implement_Client {
    public static void main(String[] args) {

        HashMap_Implementation<String,Integer> map = new HashMap_Implementation<>();

        map.put("Raj",78);
        map.put("Kunal",88);
        map.put("Ankit",58);
        map.put("Ankita",38);
        map.put("Amisha",58);
        map.put("Anku",72);
        map.put("Pooja",48);
        map.put("Amisha",98);
        System.out.println(map.containsKey("punnet"));
        System.out.println(map.get("Anku"));
        System.out.println(map);
    }


}
