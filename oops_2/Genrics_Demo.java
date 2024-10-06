package oops_2;

public class Genrics_Demo {
    public static void main(String[] args) {
        Integer[] arr={10,203,45,89,18};
        Display(arr);
        String[] arr1={"Khushi","Kashish","Jayant","Shyama","Tushar"};
        Display(arr1);
    }

    public static <T> void Display(T[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


}
