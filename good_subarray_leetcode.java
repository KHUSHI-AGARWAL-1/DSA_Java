import java.util.Stack;

public class good_subarray_leetcode {
    public static void main(String[] args) {
        int []arr ={1,4,3,7,4,5};
        int k=3;


    }
    public static int area(int arr[]){
        int ans=0;
        Stack<Integer> st= new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i]< arr[st.peek()]){
                int h= arr[st.pop()];
                int r=i;
                if(st.isEmpty()){
                    int a= h*r;
                    ans= Math.max(ans,a);

                }
                else{
                    int l=st.peek();
                    int a=h*(r-l-1);
                    ans= Math.max(ans,a);
                }
            }
            st.push(i);

        }
        int r= arr.length;
        while(!st.isEmpty()) {
            int h = arr[st.pop()];
            if (st.isEmpty()) {
                int a = h * r;
                ans = Math.max(ans, a);
            }
            else{
                int l=st.peek();
                int a=h*(r-l-1);
                ans= Math.max(ans,a);
            }

        }
        return ans;
    }
}
