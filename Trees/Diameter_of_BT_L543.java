package Trees;

public class Diameter_of_BT_L543 {

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
            if(root==null)
                    return 0;
            int ld=diameterOfBinaryTree(root.left); //left subtree
            int rd=diameterOfBinaryTree(root.right); //right subtree
            int sd=ht(root.left)+ht(root.right)+2; //self
            return Math.max(sd,Math.max(rd,ld)); //final ans
        }
        public int ht(TreeNode root){
            if(root==null){
                return -1;
            }
            int lh=ht(root.left);
            int rh=ht(root.right);
            return Math.max(lh,rh)+1;
        }

    }

}
