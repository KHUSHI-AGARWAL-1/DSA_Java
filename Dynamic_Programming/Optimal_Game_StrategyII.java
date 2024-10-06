package Dynamic_Programming;

public class Optimal_Game_StrategyII {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(Game(arr,0, arr.length-1));
    }
    public static int Game(int[] arr,int i,int j){
        if(i>j){
            return 0;
        }
        int f=arr[i]+Math.min(Game(arr,i+2,j),Game(arr,i+1,j-1));
        int l=arr[j]+Math.min(Game(arr,i+1,j-1),Game(arr,i,j-2));
        return Math.max(f,l);
    }
}
