package Graph;

import java.util.*;

public class Graph_Valid_TreeL261 {

        class Solution{
            public boolean validTree(int n,int[][] edges){
                HashMap<Integer, List<Integer>> map= new HashMap<>();
                for(int i=0;i<n;i++){
                    map.put(i,new ArrayList<>());
                }
                for (int i = 0; i < edges.length ; i++) {
                    int a=edges[i][0];
                    int b= edges[i][1];
                    map.get(a).add(b);
                    map.get(b).add(a);
                }
                Stack<Integer> st= new Stack<>();
                HashSet<Integer> visited = new HashSet<>();
                int cmp=0;
                for(int src:map.keySet()){
                    if (visited.contains(src))
                        continue;
                    cmp++;
                    st.push(src);
                    while (!st.isEmpty()){
//            1.remove
                        int rv=st.pop();
                        //2. ignore (if already visited)
                        if(visited.contains(rv)){
                            return false;
                        }
//            3.Mark visited
                        visited.add(rv);
//           4.self wrk
                        System.out.println(rv+" ");
//            5.Add nbrs
                        for(int nbrs: map.get(rv)){
                            if(!visited.contains(nbrs)){
                                st.push(nbrs);
                            }
                        }
                    }
                }
                return cmp==1; //agr cmp ==1 h to mtlb graph acyclic h
//                agr graph acyclic h to  valid tree hai
            }
        }

}
