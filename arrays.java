public class arrays {
    public static void main(String[] args) {
//        1. linear search

        int [] arr={2,4,-1,7,3,8,9};
        int item = 3;
        System.out.println(find(arr,item));
    }
    public static int find(int[]arr,int item) {
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] == item)
                return i;
        }
        return -1;
    }
}
