public class Queue {
    protected int[] arr;
    protected int front;
    private int size;
    public Queue(){
        arr= new int[5];
        front=0;
        size=0;
    }
    public Queue(int n){
        arr= new int[n];
        front=0;
        size=0;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size== arr.length;
    }
    public int size(){
        return size;
    }
    public void Enqueue(int item) throws Exception{
        if(isFull()){
            throw new Exception("full hai");
        }
        int idx=(front +size)%arr.length;
        arr[idx]=item;
        size++;

    }
    public int  Dequeue()throws Exception{
        if(isEmpty()){
            throw new Exception("empty hai");
        }
        int rv= arr[front];
        front=(front+1)%arr.length;
        size--;
        return rv;
    }
    public int GetFront()throws Exception{
        if(isEmpty()){
            throw new Exception("empty hai");
        }
        int rv=arr[front];
        return rv;
    }
    public void Display(){
        for (int i = 0; i < size; i++) {
            int idx=(front+i)%arr.length;
            System.out.print(arr[idx]+" ");
        }
        System.out.println();
    }
}
