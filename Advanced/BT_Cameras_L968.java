package Advanced;

public class BT_Cameras_L968 {
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
        public int minCameraCover(TreeNode root) {

            int c=count(root);
            return c==-1?count+1:count;


        }
        public int count(TreeNode root){
            if(root==null){
                return 0;
            }
            int left=count(root.left);
            int right=count(root.right);

            if(left==-1 || right==-1){
                count++;
                return 1;
            }
            else if(left==1 || right==1){
                return 0;
            }
            else{
                return -1;
            }

        }

    }
}
