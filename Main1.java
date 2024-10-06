public class Main1 {
    public static void main(String[] args) {
int[] arr={50,30,15,51,10,20,15};
        System.out.println(check(arr));
    }
    public static int check(int[] numbers) {
        int N=numbers.length;
        int c=1;
        // Implement your solution here
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(valid(numbers[i],numbers[j])){
                    c++;
                }
            }
        }
        return c;
    }
    static boolean valid(int num1, int num2){
        String n1 = Integer.toString(num1);
        String n2 = Integer.toString(num2);
        for (int i = 0; i < n1.length(); i++)
            for (int j = 0; j < n2.length(); j++)
                if (n1.charAt(i) == n2.charAt(j)){
                    return true;
                }
        return false;
    }
}
//    public class Node {
//        int data;
//        Node next;
//
//        public Node(int data) {
//            this.data = data;
//        }
//    }
//private Node head;
//        private  Node tail;
//       private int size;
//       public void addf(int item){
//           Node nn= new Node(item);
//           if(size==0){
//               head=nn;
//               tail=nn;
//               size++;
//           }
//           else{
//               nn.next=head;
//               head=nn;
//               size++;
//           }
//       }
//       public void display(){
//           Node t= head;
//           while(t!=null){
//               System.out.print(t.data+" ->");
//               t=t.next;
//
//           }
//           System.out.println();
//       }
//       public void addi(int item,int k){
//           Node nn = new Node(item);
//           Node k_1=getnode(k-1);
//           nn.next=k_1.next;
//           k_1.next=nn;
//           size++;
//       }
//       public void addl(int item){
//           if(size==0){
//               addf(item);
//           }
//           else{
//               Node nn = new Node(item);
//               tail.next=nn;
//               tail=nn;
//               size++;
//           }
//       }
//       public int getf() throws Exception{
//           if(head==null)
//               throw new Exception("empty");
//           return head.data;
//       }
//       public int getl( )throws Exception{
//           if(head==null)
//               throw new Exception("empty");
//           return tail.data;
//    }
//public int getindex(int k) throws Exception{
//           return getnode(k).data;
//}
//private Node getnode(int k) throws Exception{
//           if(k<=size || k>0){
//               throw new Exception("invalid range");
//           }   Node temp=head;
//    for (int i = 1; i <=k ; i++) {
//     temp=temp.next;
//
//    }
//    return temp;
//
//}
//public int removef(){
//           Node temp=head;
//           head=head.next;
//           temp.next=null;
//           return temp.data;
//}
//public int removel() throws Exception{
//Node nn= getnode(size-2);
//int d=tail.data;
//tail=nn;
//tail.next=null;
//return d;
//}
//public int removeindex(int k){
//           Node k_1=getnode(k-1);
//           Node k= k_1.next;
//          k_1.next =k.next;
//          k.next=null;
//          size--;
//
//
//}
//
////    public static void main(String[] args) {
////        Stack st = new Stack<>();
////        int c = 1;
////        Scanner sc = new Scanner(System.in);
////        String s = sc.next();
////        int ans[] = new int[s.length()+1];
////        for (int i = 0; i <= s.length(); i++) {
////            if (i == s.length() || s.charAt(i) == 'I') {
////                ans[i] = c;
////                c++;
////                while (!st.empty()) {
////                    ans[(int) st.pop()] = c;
////                    c++;
////                }
////
////            }
////            st.push(i);
////        }
////        for (int i = 0; i <ans.length ; i++) {
////            System.out.print(ans[i]+" ");
////        }
////        Stack st = new Stack<>();
////        st.push(10);
////        st.push(10);
////        st.push(30);
////        System.out.println(st.top());
//public static void main(String[] args) throws Exception {
//           Main1 ll= new Main1();
//           ll.addf(10);
//           ll.addf(20);
//           ll.addf(30);
//
//           ll.addl(40);
//
//    ll.removef();
//    ll.removel();
//
//    ll.display();
//}
//    }
//
//
//
//
//
//
//
//
//
