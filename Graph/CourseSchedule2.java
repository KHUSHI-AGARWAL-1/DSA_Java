package Graph;

import java.util.*;

public class CourseSchedule2 {

    class Solution {
        public int[] findOrder(int numCourses, int[][] prerequisites) {
            HashMap<Integer, List<Integer>> map= new HashMap<>();
            for (int i = 0; i <numCourses ; i++) {
                map.put(i,new ArrayList<>());
            }
            for (int i = 0; i < prerequisites.length ; i++) {
                int a1=prerequisites[i][0];
                int b1=prerequisites[i][1];
                map.get(b1).add(a1);
            }
            return Topological(map);
        }
        public int [] indegree(HashMap<Integer,List<Integer>> map){
            int v=map.size();
            int[] arr=new int[v];
            for(int key:map.keySet()){
                for (int nbrs :map.get(key) ) {
                    arr[nbrs]++;
                }
            }
            return arr;

        }
        public int[] Topological(HashMap<Integer,List<Integer>> map){
            int[] in=indegree(map);
            int[]order=new int[map.size()];
            Queue<Integer> q=new LinkedList<>();
            for (int i = 0; i <in.length ; i++) {
                if(in[i]==0){
                    q.add(i);
                }
            }
            int c=0;
            int idx=0;
            while (!q.isEmpty()){
                int v=q.poll();
                order[idx]=v;
                idx++;
                c++;
                for (int nbrs: map.get(v)){
                    in[nbrs]--;
                    if(in[nbrs]==0){
                        q.add(nbrs);
                    }
                }
            }
            return c==map.size() ? order:new int[0];
        }
    }
    }


