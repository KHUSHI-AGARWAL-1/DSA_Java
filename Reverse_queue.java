public class Reverse_queue {
    public static void main(String[] args) throws Exception {
        Dynamic_Queue dq = new Dynamic_Queue();
        dq.Enqueue(10);
        dq.Enqueue(20);
        dq.Enqueue(30);
        dq.Enqueue(40);
        dq.Display();
        Reverse(dq);
        dq.Display();
    }
    public static void Reverse(Dynamic_Queue dq) throws Exception{
        if(dq.isEmpty())
            return;
        int x= dq.Dequeue();
        Reverse(dq);
        dq.Enqueue(x);
    }
}
