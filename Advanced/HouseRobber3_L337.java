package Advanced;

import java.util.HashMap;
import java.util.HashSet;

public class HouseRobber3_L337 {

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
        HashMap<TreeNode,Integer> dp= new HashMap<>();
        public int rob(TreeNode root) {
            if(root==null) return 0;
            if(dp.containsKey(root)) return dp.get(root);
          //rob
             int ans= root.val;
             if(root.left!=null){
                 ans=ans+rob(root.left.left)+rob(root.left.right);
             }
            if(root.right!=null){
                ans=ans+rob(root.right.left)+rob(root.right.right);
            }

            //dont rob
            int dans= rob(root.left)+rob(root.right);
            dp.put(root,Math.max(ans,dans));
            return Math.max(ans,dans);
        }
    }
}
