//import java.awt.*;
//
//public class Linked_list {
//    public class Node{
//        int val;
//        Node next;
//    }
//    private Node head;
//    private int size;
//    private Node tail; // tail is not on null but at last
//    public void AddFirst(int item) { //complexity of o(1) i.e., constant
//        Node nn = new Node();
//        nn.val = item;
//        if (size == 0) {
//            this.head = nn;
//            this.tail = nn;
//            this.size++;
//
//        } else {
//            nn.next = head;
//            head = nn;
//            this.size++;
//        }
//    }
//        public void Display(){
//            Node temp=head;
//            while(temp!=null){
//                System.out.print(temp.val+" ");
//                temp=temp.next;
//            }
//            System.out.println();
//        }
//        public void Addlast(int item) { //O(1)
//            if (size == 0) {
//                AddFirst(item);
//            } else {
//                Node nn = new Node();
//                nn.val = item;
//                tail.next = nn;
//                tail = nn;
//                size++;
//            }
//        }
//        public Node Getnode(int k) throws Exception{
//        if (k<0 || k>=size){
//            throw new Exception(" k out of range");
//
//        }
//
//
//        Node temp= head;
//        for (int i=1;i<=k;i++){
//            temp=temp.next;
//        }+
//        return temp;
//}
//public void AddIndex(int item,int k) throws Exception{
//    if (k<0 || k>=size){
//        throw new Exception(" k out of range");
//    }
//    if(k==0){
//        AddFirst(item);
//    } else if (k==size) {
//        Addlast(item);
//
//    }
//    else {
//        Node nn = new Node();
//        nn.val=item;
//        Node k_1th= Getnode(k-1);
//        Node kth = k_1th.next;
//        k_1th.next=nn;
//        nn.next=kth;
//        size++;
//    }
//}
//public int getfirst(){
//        return head.val;
//}
//public int getLast(){
//        return tail.val;
//}
//public int getindex(int k) throws Exception{
//        return Getnode(k).val;
//}
//// complexity pr farak pdta h last se nikalne m isliye first prefer krte h
//    // stack m removefirst pop ke liye and addfirst push ke liye
//    // queue ke liye addlast or removelast
//public int removefirst() throws Exception{ //O(1)
//        if(size==0){
//            throw new Exception("linkedlist empty");
//        }
//        int rv=head.val;
//        if(size==1){
//            head=null;
//            tail=null;
//            size--;
//        }
//        else {
//            Node temp=head;
//            head=head.next;
//            temp.next=null;
//            size--;
//        }
//        return rv;
//}
//public int removelast() throws Exception{ //O(N)
//        if(size==0){
//            throw new Exception("Empty");
//        }
//        if(size==1){
//            return removefirst();
//        }
//        else {
//            int rv = tail.val;
//            Node n = Getnode(size - 2);
//            tail = n;
//            tail.next = null;
//            size--;
//            return rv;
//        }
//    }
//    public int removeindex(int k) throws Exception{
//        if(k<0 || k>size){
//            throw new Exception("out of range");
//        }
//        if(k==0){
//            return removefirst();
//        }
//
//
//        else if(k==size-1){
//            return removelast();
//        }
////        else{
////  Node K_1th =Getnode(k-1);
//            Node kth=K_1th.next;
//            K_1th.next=null;
//            size--;
//            return kth.val;
////        }
//    }
//
//}
