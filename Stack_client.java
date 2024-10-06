public class Stack_client {
    public static void main(String[] args) throws Exception {
        Stack st = new Stack(); // Stack java wala nhi apna wala jo create kiya tha
        st.push(5);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(6);
//        st.push(25);
//        st.push(36);
//        st.push(42);
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.pop());
        st.Display();
        st.isEmpty();
        st.isFull();


    }
}
