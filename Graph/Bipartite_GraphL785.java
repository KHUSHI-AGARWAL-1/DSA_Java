package Graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Bipartite_GraphL785 {
    class Solution {
        public boolean isBipartite(int[][] graph) {
            HashMap<Integer,Integer> visited =new HashMap<>();
            Queue<BipartitePair> q= new LinkedList<>();
            for (int i = 0; i < graph.length; i++) {
                    if(visited.containsKey(i)){
                        continue;
                    }
                    q.add(new BipartitePair(i,0));
                    while(!q.isEmpty()){
                        BipartitePair rp=q.poll();
                        if(visited.containsKey(rp.vert)){
                            if(visited.get(rp.vert)!=rp.dist){
                                return false;
                            }
                            continue;
                        }
                        visited.put(rp.vert,rp.dist);
                        for(int nbrs: graph[rp.vert]){
                            if(!visited.containsKey(nbrs)){
                                q.add(new BipartitePair(nbrs, rp.dist+1));
                            }
                        }
                    }
            }
            return true;
        }
    }

    class BipartitePair{
        int vert;
        int dist;
        public BipartitePair(int vert,int dist){
            this.vert=vert;
            this.dist=dist;
        }
    }
}
