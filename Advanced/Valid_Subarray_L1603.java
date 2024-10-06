package Advanced;

import java.util.Stack;

public class Valid_Subarray_L1603 {
    //Given an array A of integers, return the number of non-empty continuous subarrays that satisfy
    // the following condition The leftmost element of the subarray is not larger than other elements in
    // the subarray.

    public static void main(String[] args) {
        int[] arr={1,4,2,5,3};
        System.out.println(NumOfSub(arr));
    }

    //next greater element ki trh check krenge ki agr array ka element st.peek se bda h tbhi subarray bnega
    // or st point hoga top of stack end point will be ele of arr.. num of subarr will be stack ka size
    public static int NumOfSub(int[] arr){ int ans=0;
        Stack<Integer> st= new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i]<arr[st.peek()]){
                st.pop();
            }
            st.push(i);
            ans+=st.size();
        }
        return ans;
    }
}

