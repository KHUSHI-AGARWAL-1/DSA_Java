import java.util.Stack;

public class Reverse_stack {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(10);
        st.push(16);
        st.push(18);
        System.out.println(st);
        Reverse(st);
        System.out.println(st);
    }
    public static void Reverse(Stack<Integer> st){
        if(st.isEmpty()){

            return;
        }
        int item=st.pop();
       Reverse(st);
        Insert_down(st,item);
    }
    public static void Insert_down(Stack<Integer> st,int ele){
        if(st.isEmpty()){
            st.push(ele);
            return;
        }
        int item=st.pop();
        Insert_down(st,ele);
        st.push(item);
    }
}
