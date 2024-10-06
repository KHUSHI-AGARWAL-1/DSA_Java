public class Dynamic_Stack extends  Stack{
public void push (int item) throws Exception{
    if(this.isFull()){ // this se same class ka ele
        int []a= new int[2*arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i]=arr[i];

        }
        arr=a;

    }
    super.push(item); // super se parent ka
}
}
