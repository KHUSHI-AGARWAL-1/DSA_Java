import java.util.Stack;

public class Insert_atlast_stack {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(10);
        st.push(16);
        st.push(18);
        System.out.println(st);
        Insert(st,8);
        System.out.println(st);
    }
    public static void Insert(Stack<Integer> st,int ele){
        if(st.isEmpty()){
            st.push(ele);
            return;
        }
        int item=st.pop();
        Insert(st,ele);
        st.push(item);
    }
}
