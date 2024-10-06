public class max_subarray {
    public static void main(String[] args) {
        int[] arr={5,4,-1,7,8};
        System.out.println(maxsum(arr));

    }
    public static int maxsum(int[]arr){
        int ans=Integer.MIN_VALUE;
        int s=0;
        for (int i = 0; i <arr.length ; i++) {


                s+=arr[i];
                ans=Math.max(s,ans);
                if(s<0){
                    s=0;
                }


        }return ans;
    }

}
