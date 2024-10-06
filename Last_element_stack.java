import java.util.Stack;

public class Last_element_stack {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(10);
        st.push(16);
        st.push(18);
        System.out.println(LastValue(st));

    }
    public static int LastValue(Stack<Integer> st){
        if(st.size()==1)
            return st.peek();
        int item=st.pop();
        int x= LastValue(st);
        st.push(item);
        return x;
    }
}
