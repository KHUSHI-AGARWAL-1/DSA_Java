package oops_2;

import java.util.Arrays;
import java.util.Comparator;

public class Cars_Client {
    public static void main(String[] args) {
        Cars []arr= new Cars[5];
        arr[0]=new Cars(200,10,"White");
        arr[1]=new Cars(1000,20,"Black");
        arr[2]=new Cars(345,3,"Yellow");
        arr[3]=new Cars(34,89,"Grey");
        arr[4]=new Cars(8907,6,"Red");
        Arrays.sort(arr, new Comparator<Cars>() {
            @Override
            public int compare(Cars o1, Cars o2) {
                return o1.speed-o2.speed;

            }
        });
//        sort(arr);
Display(arr);

    }
    public static void Display(Cars[] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    public  static <T extends Comparable<T>>void sort(T[] arr){
        for(int i=1;i<arr.length;i++){ // no of passes
            for(int j=0;j<arr.length-i;j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    T temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
}
