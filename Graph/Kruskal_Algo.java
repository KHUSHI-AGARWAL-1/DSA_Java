package Graph;

import java.util.*;

public class Kruskal_Algo {
    HashMap<Integer, HashMap<Integer, Integer>> map;

    public Kruskal_Algo(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);

    }
    class EdgePair{
        int e1;
        int e2;
        int cost;
        public EdgePair(int e1,int e2,int cost){
            this.e1=e1;
            this.e2=e2;
            this.cost=cost;
        }
        public String toString(){
            return this.e1 +" " + this.e2 + " @ " + this.cost;
        }
    }

    public List<EdgePair> GetAllEdge(){
        List<EdgePair> ll= new ArrayList<>();
        for (int e1: map.keySet()){
            for (int e2:map.get(e1).keySet()){
                int cost= map.get(e1).get(e2);
                ll.add(new EdgePair(e1,e2,cost));
                EdgePair e=new EdgePair(e1,e2,cost);
                ll.add(e);
            }
        }
        return ll;
    }
    public void Kruskal(){
        List<EdgePair> ll=GetAllEdge();
        Collections.sort(ll, new Comparator<EdgePair>() {
            @Override
            public int compare(EdgePair o1, EdgePair o2) {
                return o1.cost- o2.cost;
            }
        });
        Disjoint_Set_Union dsu= new Disjoint_Set_Union();
        for (int  vert:map.keySet()){
            dsu.Create(vert);
        }
        for (EdgePair e:ll){
            int re1=dsu.find(e.e1);
            int re2=dsu.find(e.e2);
                    if(re1==re2){
                        //nothing
                    }
                    else{
                        dsu.Union(e.e1,e.e2);
                        System.out.println(e);
                    }
        }
    }
    public static void main(String[] args) {
        Kruskal_Algo g=new Kruskal_Algo(7);
        g.AddEdge(1,4,6);
        g.AddEdge(1,2,10);
        g.AddEdge(2,3,7);
        g.AddEdge(3,4,5);
        g.AddEdge(4,5,1);
        g.AddEdge(5,6,4);
        g.AddEdge(7,5,2);
        g.AddEdge(6,7,3);
        g.Kruskal();
    }
}
