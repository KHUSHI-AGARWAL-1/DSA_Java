package Trees;

public class Validate_BSTL98 {

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
        public boolean isValidBST(TreeNode root) {
return ValidBST(root).isbst;
        }
        public BSTPair ValidBST(TreeNode root){
            if(root==null){
                return new BSTPair();
            }
            BSTPair lbp=ValidBST(root.left);
            BSTPair rbp=ValidBST(root.right);
            BSTPair sbp=new BSTPair();
            sbp.max=Math.max(lbp.max,Math.max(rbp.max, root.val));
            sbp.min=Math.min(root.val, Math.min(lbp.min, rbp.min));
            if(lbp.isbst && rbp.isbst && lbp.max< root.val && rbp.min> root.val){
                sbp.isbst=true;
            }
            else {
                sbp.isbst=false;
            }
            return sbp;
        }
    }
    class BSTPair{
      boolean isbst=true;
      long min=Long.MAX_VALUE;
      long max=Long.MIN_VALUE;


    }
}
