public class linked_list_cycle_client {
    public static void main(String[] args) throws Exception{
        linked_list_cycle ll= new linked_list_cycle();
       ll.AddFirst(11);
        ll.Addlast(10);
        ll.AddFirst(20);
        ll.Addlast(80);
        ll.createcycle();

        ll.cycle_removal2();
        ll.Display();
    }
}
