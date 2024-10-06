package Advanced;

public class DistributeCoin_BT_L979 {
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
        int count=0;
        public int distributeCoins(TreeNode root) {

            coin(root);
            return count;


        }
        public  int coin(TreeNode root){
            if(root==null){
                return 0;
            }
            int left=coin(root.left);
            int right=coin(root.right);
            count=count+Math.abs(left)+Math.abs(right);

            return root.val-1+left+right;
        }
    }
}
