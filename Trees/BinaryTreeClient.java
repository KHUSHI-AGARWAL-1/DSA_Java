package Trees;

public class BinaryTreeClient {
    public static void main(String[] args) {
        // 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
        Binary_Tree_Implementation bt=new Binary_Tree_Implementation();
        bt.Display();
        System.out.println(bt.max()); //70
        System.out.println((bt.find(70))); //true
        System.out.println(bt.find(100)); //false
        System.out.println(bt.ht());
        bt.PreOrder();
        bt.PostOrder();
        bt.InOrder();
        bt.LevelOrder();
    }
}
