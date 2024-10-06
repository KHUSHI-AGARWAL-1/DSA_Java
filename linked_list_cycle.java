public class linked_list_cycle {

    public class Node{
        int val;
   Node next;
    }
    private Node head;
    private int size;
    private Node tail;

    public void AddFirst(int item) { //complexity of o(1) i.e., constant
       Node nn = new Node();
        nn.val = item;
        if (size == 0) {
            this.head = nn;
            this.tail = nn;
            this.size++;

        } else {
            nn.next = head;
            head = nn;
            this.size++;
        }
    }
    public void Display(){
       Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"-> ");
            temp=temp.next;
        }
        System.out.println(".");
    }
    public void createcycle() throws Exception{
        Node nn= Getnode(2);
this.tail.next=nn;
    }
    public Node Getnode(int k) throws Exception{
        if (k<0 || k>=size){
            throw new Exception(" k out of range");

        }


    Node temp= head;
        for (int i=1;i<=k;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void Addlast(int item) { //O(1)
        if (size == 0) {
            AddFirst(item);
        } else {
            Node nn = new Node();
            nn.val = item;
            tail.next = nn;
            tail = nn;
            size++;
        }
    }

    public void CycleRemoval1(){
        Node meet=hascycle(head);
        if(meet==null){
            return;
        }
        Node curr= head;
        while (curr!=null){
            Node temp = meet;
            while(temp.next!=meet){ // cycle m move krna
                if(temp.next!=curr){
                    temp.next=null;
                    return;
                }
                temp=temp.next;

            }
            curr=curr.next;
        }

    }
    public Node hascycle(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
                return slow;
        }
        return null;
    }
    public void cycle_removal2() {
        Node meet = hascycle(head);
        if (meet == null) {
            return;
        }
        //count of cycle
        Node temp=meet;
        int count=1;
        while(temp.next!=meet){
            count++;
            temp=temp.next;
        }
        // m length aage jaayega
        Node fast=head;
        for(int i=0;i<=count;i++){
            fast=fast.next;

        }
        Node slow=head;
        while(slow.next!=fast.next){
            fast=fast.next;
            slow=slow.next;
        }
        fast.next=null;

    }
}
