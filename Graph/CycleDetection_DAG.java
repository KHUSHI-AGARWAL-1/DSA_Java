package Graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class CycleDetection_DAG {
    HashMap<Integer, HashMap<Integer,Integer>> map=new HashMap<>();
    CycleDetection_DAG(int v){
        for (int i = 1; i <= v; i++) {
            map.put(i,new HashMap<>());
        }
    }
    public void addEdge(int v1,int v2){
        map.get(v1).put(v2,0);   //v1-->v2
    }
    public int [] indegree(){
        int v=map.size();
        int[] arr=new int[v+1];
        for(int key:map.keySet()){
            for (int nbrs :map.get(key).keySet() ) {
                arr[nbrs]++;
            }
        }
        return arr;

    }
    public boolean Topological(){
        int[] in=indegree();
        Queue<Integer> q=new LinkedList<>();
        for (int i = 1; i <in.length ; i++) {
            if(in[i]==0){
                q.add(i);
            }
        }
        int c=0;
        while (!q.isEmpty()){
            int v=q.poll();
           c++;
            for (int nbrs: map.get(v).keySet()){
                in[nbrs]--;
                if(in[nbrs]==0){
                    q.add(nbrs);
                }
            }
        }
        return c<map.size();
    }
    public static void main(String[] args) {
        CycleDetection_DAG ts= new CycleDetection_DAG(7);
        ts.addEdge(1,2);
        ts.addEdge(1,4);
        ts.addEdge(4,3);
        ts.addEdge(3,2);
        ts.addEdge(4,5);
        ts.addEdge(5,7);
        ts.addEdge(6,3);
        ts.addEdge(6,7);
        System.out.println(ts.Topological());
    }
}
