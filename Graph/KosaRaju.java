package Graph;

//Strongly connected component

import java.util.*;
public class KosaRaju {
    HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
    public KosaRaju(int v) {
        for (int i = 0; i < v; i++) {
            map.put(i, new HashMap<>());
        }
    }
    public void addedge(int v1, int v2) {
        map.get(v1).put(v2, 5);
    }

    public void KosaRaju_Algo(){
        HashSet<Integer> visited=new HashSet<>();
        Stack<Integer> st=new Stack<>();

        //dfs all vtx and add in stack
        dfs(visited,st,0);

        //transpose graph
        HashMap<Integer, HashMap<Integer, Integer>> map1 = new HashMap<>();
        Transpose(map1);

        //dubara dfs nd componenet count
        int c=0;
        visited=new HashSet<>();
        while(st.isEmpty()){
            int pop=st.pop();
            if(!visited.contains(pop)){
                c++;
                dfs1(map1,visited,pop);
            }
        }
        System.out.println(c);
    }
    private void dfs1(HashMap<Integer,HashMap<Integer,Integer>>map1, HashSet<Integer> visited, int pop){
        visited.add(pop);
        for(int nbrs: map1.get(pop).keySet()){
            if(!visited.contains(nbrs)){
                dfs1(map1,visited,nbrs);
            }
        }
    }

    private void Transpose(HashMap<Integer, HashMap<Integer, Integer>> map1) { //graph transpose
        for (int v1:map.keySet()){
            for (int v2:map.get(v1).keySet()){
                if(!map1.containsKey(v2)){
                    map1.put(v2,new HashMap<>());
                }
                map1.get(v2).put(v1,5);
            }
        }
        for (int v1:map.keySet()){
            if(!map1.containsKey(v1)){
                map1.put(v1,new HashMap<>());
            }
        }
    }

    public void dfs(HashSet<Integer> visited,Stack<Integer> st,int vtx){
        visited.add(vtx);
        for(int nbrs:map.get(vtx).keySet()){
            if(!visited.contains(nbrs)){
                dfs(visited,st,nbrs);
            }
        }
        st.push(vtx);
    }

    }
