package Trees;

import java.util.ArrayList;
import java.util.List;

public class BT_Right_View_L199 {
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
        int maxdepth=0;
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> ll=new ArrayList<>();
            righView(root,0,ll);
            return ll;
        }
        public void righView(TreeNode root,int currlevel,List<Integer> ll) {
            if(root==null){
                return;
            }
                if(maxdepth<currlevel){
                ll.add(root.val);
                maxdepth=currlevel;
                }
                righView(root.right,currlevel+1,ll);
                righView(root.left,currlevel+1,ll);
        }
    }
}
