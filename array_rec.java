public class array_rec {
    public static void main(String[] args) {
        int[] arr={2,3,7,2,3,4,6,8,7};
        int item=3;
//        System.out.println(find_index(arr,item, 0));
        System.out.println(find_index2(arr,item, arr.length-1));
    }
//   1. print first occurence
//    public static int find_index(int[] arr,int item,int i){
//        if(i== arr.length){
//            return -1;
//        }
//        if(arr[i]==item){
//            return i;
//        }
//        return find_index(arr,item,i+1);
//    }
//    2. print last occurence
    public static int find_index2(int[] arr,int item,int i){
        if(i<0){
            return -1;
        }
        if(arr[i]==item){
            return i;
        }
        return find_index2(arr,item,i-1);
    }

}
