package Trees;

public class Dia_of_BT_optimised {
            public class TreeNode {
    int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    class Solution {
        public int diameterOfBinaryTree(TreeNode root) {
return diameter(root).dia;
        }
        public Diapair diameter(TreeNode root){
            if(root==null){
                return new Diapair();
            }
            Diapair ldp=diameter(root.left);
            Diapair rdp=diameter(root.right);
            int sd= ldp.ht+rdp.ht+2;
            Diapair sdp= new Diapair();
            sdp.dia=Math.max(sd,Math.max(rdp.dia,ldp.dia));
            sdp.ht=Math.max(ldp.ht,rdp.ht)+1;
            return sdp;
        }
    }
    class Diapair{
                int dia=0;
                int ht=-1;
    }
}
