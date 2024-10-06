public class bubble_sort {
    public static void main(String[] args) {
        int[] arr={3,5,4,2,1};
        sort(arr);

    }
    public  static void sort(int[] arr){
        for(int i=1;i<arr.length;i++){ // no of passes
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int k=0;k< arr.length;k++){
            System.out.print(arr[k]);
        }
    }
}
