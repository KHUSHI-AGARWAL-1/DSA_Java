package Trees;

public class Largest_bstSubtree_L333 {
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
        public int largestBstSubtree(TreeNode root) {
            return ValidBST(root).size;
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
                sbp.size=lbp.size+rbp.size+1;
            }
            else {
                sbp.isbst=false;
                sbp.size=Math.max(lbp.size,rbp.size);
            }
            return sbp;
        }
    }
    class BSTPair{
        boolean isbst=true;
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
int size=0;

    }
}
