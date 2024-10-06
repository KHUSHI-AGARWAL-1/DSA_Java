package Graph;

import java.util.*;

public class graph_implementation2 {
    HashMap<Integer, HashMap<Integer,Integer>> map;
    public graph_implementation2(int v){

        map=new HashMap<>();
        for (int i = 1; i <=v ; i++) {
            map.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1,int v2, int cost) {
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public boolean BFS(int src,int des){ //BREADTH FIRST SEARCH
        Queue<Integer> q= new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        q.add(src);
        while (!q.isEmpty()){
//            1.remove
            int rv=q.poll();
            //2. ignore (if already visited)
            if(visited.contains(rv)){
                continue;
            }
//            3.Mark visited
             visited.add(rv);
//           4.self wrk
            if(rv==des){
                return true;
            }
//            5.Add nbrs
                for(int nbrs: map.get(rv).keySet()){
                    if(!visited.contains(nbrs)){
                        q.add(nbrs);
                    }
                }
        }
        return false;
    }

    public boolean DFS(int src,int des){ //DEPTH FIRST SEARCH
        Stack<Integer> st= new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        st.push(src);
        while (!st.isEmpty()){
//            1.remove
            int rv=st.pop();
            //2. ignore (if already visited)
            if(visited.contains(rv)){
                continue;
            }
//            3.Mark visited
            visited.add(rv);
//           4.self wrk
            if(rv==des){
                return true;
            }
//            5.Add nbrs
            for(int nbrs: map.get(rv).keySet()){
                if(!visited.contains(nbrs)){
                    st.push(nbrs);
                }
            }
        }
        return false;
    }
    public void BFT(){ //BREADTH FIRST TRAVERSAL
        Queue<Integer> q= new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        for (int src : map.keySet()) {
            if (visited.contains(src))
                continue;

            q.add(src);
            while (!q.isEmpty()) {
//            1.remove
                int rv = q.poll();
                //2. ignore (if already visited)
                if (visited.contains(rv)) {
                    continue;
                }
//            3.Mark visited
                visited.add(rv);
//           4.self wrk
                System.out.print(rv + " ");
//            5.Add nbrs
                for (int nbrs : map.get(rv).keySet()) {
                    if (!visited.contains(nbrs)) {
                        q.add(nbrs);
                    }
                }
            }
        }
    }

    public void DFT(){ //DEPTH FIRST TRAVERSAL
        Stack<Integer> st= new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        for(int src:map.keySet()) {
            if (visited.contains(src))
                continue;
            st.push(src);
            while (!st.isEmpty()) {
//            1.remove
                int rv = st.pop();
                //2. ignore (if already visited)
                if (visited.contains(rv)) {
                    continue;
                }
//            3.Mark visited
                visited.add(rv);
//           4.self wrk
                System.out.println(rv + " ");
//            5.Add nbrs
                for (int nbrs : map.get(rv).keySet()) {
                    if (!visited.contains(nbrs)) {
                        st.push(nbrs);
                    }
                }
            }
        }
    }
    public boolean isConnected(){ //graph coonected ya disconnected
        Queue<Integer> q= new LinkedList<>();
        int c=0;
        HashSet<Integer> visited = new HashSet<>();
        for (int src : map.keySet()) {
            if (visited.contains(src))
                continue;
            c++;
            q.add(src);
            while (!q.isEmpty()) {
//            1.remove
                int rv = q.poll();
                //2. ignore (if already visited)
                if (visited.contains(rv)) {
                    continue;
                }
//            3.Mark visited
                visited.add(rv);
//           4.self wrk
                System.out.print(rv + " ");
//            5.Add nbrs
                for (int nbrs : map.get(rv).keySet()) {
                    if (!visited.contains(nbrs)) {
                        q.add(nbrs);
                    }
                }
            }
        }
        return c==1; //agr count ki value 1 h to mtlb graph connected h kyuki sirf ek component h
    }

}
