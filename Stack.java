public class Stack {
    protected int [] arr;
    protected int tos;
    public Stack (){
        arr= new int[5];
        tos=-1; // ek bhi ele nhi h
    }
    public Stack(int n){
        arr= new int[n];
        tos=-1;
    }
    public boolean isEmpty(){

        return tos==-1;
    }
    public boolean isFull(){

        return tos== arr.length-1 ;
    }
    public void push(int item) throws Exception{
        if(isFull()){
            throw new Exception("full hai");
        }
        tos++;
        arr[tos]=item;
    }
    public int size(){
        return tos+1;
    }
    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Empty hai");
        }
        int x=arr[tos];
        tos--;
        return x;
    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Empty hai");
        }
        int x=arr[tos];
        return x;
    }
    public void Display(){
        for (int i = 0; i <=tos; i++) {
            System.out.println(arr[i]+"->");
        }
        System.out.println(".");
    }
}
