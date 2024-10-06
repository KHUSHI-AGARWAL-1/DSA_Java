package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Binary_Tree_Implementation {
    public class Node{
        int data;
        Node left;
        Node right;
    }
    private Node root;
    public Binary_Tree_Implementation(){

        root=createtree();
    }
    Scanner sc = new Scanner(System.in);
    private Node createtree(){
        int item = sc.nextInt();
        Node nn= new Node();
        nn.data=item;
        boolean hasLeftchild=sc.nextBoolean();
        if(hasLeftchild==true){
            nn.left=createtree();
        }
        boolean hasrightchild=sc.nextBoolean();
        if(hasrightchild==true){
            nn.right=createtree();
        }

        return nn;
    }
    public void Display(){

        Display(root);
    }
    private void Display(Node nn){
        if(nn==null){
            return;
        }
        String s="";
        s="<--"+nn.data+"-->";
        if(nn.left!=null){
            s=nn.left.data+s;
        }
        else{
            s="."+s;
        }
        if(nn.right!=null){
            s=s+nn.right.data;
        }
        else{
            s=s+".";
        }
        System.out.println(s);
        Display(nn.left);
        Display(nn.right);
    }
    public int max(){
        return max(root);

    }
    private int max(Node nn){
        if(nn==null){
            return Integer.MIN_VALUE;
        }
        int left=max(nn.left);
        int right=max(nn.right);
        return Math.max(nn.data,Math.max(left,right));
    }
    public boolean find(int item){
        return find(root,item);

    }
    private boolean find(Node nn,int item){
        if(nn==null){
            return false;
        }
        if(nn.data==item){
            return true;
        }
        boolean left = find(nn.left,item);
        boolean right = find(nn.right,item);
        return left||right;

    }
    public int ht(){
        return ht(root);
    }
    private int ht(Node nn){
        if(nn==null){
            return -1; //return -1 pr single node ki height 0;
            // return 0 pr single node ki height 1
        }
        int lht=ht(nn.left);
        int rht=ht(nn.right);
        return Math.max(lht,rht)+1;
    }
    public void PreOrder(){
        PreOrder(this.root);
        System.out.println();
    }
    private void PreOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data+" ");
        PreOrder(node.left);
        PreOrder(node.right);
    }
    public void PostOrder(){
        PostOrder(this.root);
        System.out.println();
    }
    private void PostOrder(Node node){
        if(node==null){
            return;
        }
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.data+" ");
    }
    public void InOrder(){
        InOrder(this.root);
        System.out.println();
    }
    private void InOrder(Node node){
        if(node==null){
            return;
        }
        InOrder(node.left);
        System.out.print(node.data+" ");
        InOrder(node.right);

    }
    public void LevelOrder(){
        Queue<Node> q= new LinkedList<>();
//        LinkedList<Node> queue=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node rv=q.remove(); //can also use q.poll to remove first element
            System.out.print(rv.data+" ");
            if(rv.left!=null){
                q.add(rv.left);
            }
            if(rv.right!=null){
                q.add(rv.right);
            }
         }
        System.out.println();
    }

}
