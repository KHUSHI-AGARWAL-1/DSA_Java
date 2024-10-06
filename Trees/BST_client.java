package Trees;

public class BST_client {
    public static void main(String[] args) {
        int[] arr={10,0,30,40,50,60,70,80};
        BST bt = new BST(arr);
        bt.PreOrder();
    }
}
