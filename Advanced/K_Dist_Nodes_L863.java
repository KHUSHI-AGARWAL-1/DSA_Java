package Advanced;
import  java.util.*;
public class K_Dist_Nodes_L863 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    class Solution {
        HashMap<Integer,List<Integer>>  map= new HashMap<>();
        public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
                createGraph(root);
            List<Integer>ll= new ArrayList<>();
                BFS(target.val,ll ,k);
                return ll;
        }
        class Pair{
            int vtx;
            int dis;
            public Pair(int vtx,int dis){
                this.vtx=vtx;
                this.dis=dis;
            }
        }

        private void BFS(int val,List<Integer> ll,int k){
            Queue<Pair> q= new LinkedList<>();
            HashSet<Integer> visited= new HashSet<>();
            q.add(new Pair(val,0));
            while (!q.isEmpty()){
                Pair p= q.poll();
                if(visited.contains(p.vtx)){
                    continue;
                }
                visited.add(p.vtx);
                if(p.dis==k){
                    ll.add(p.vtx);
                }
                for(int nbrs:map.get(p.vtx)){
                    if(visited.contains(nbrs)){
                        q.add(new Pair(nbrs,p.dis+1));
                    }
                }
            }
        }
        public void createGraph(TreeNode root){
            if(!map.containsKey(root.val)){
                map.put(root.val,new ArrayList<>());
            }
            if(root.left!=null){
                map.get(root.val).add(root.left.val);
                map.get(root.val).add(root.left.val);
                map.get(root.left.val).add(root.val);
            }
            if(root.right!=null){
                map.get(root.val).add(root.right.val);
                map.get(root.val).add(root.right.val);
                map.get(root.right.val).add(root.val);
            }
            createGraph(root.left);
            createGraph(root.right);
        }
    }
}
