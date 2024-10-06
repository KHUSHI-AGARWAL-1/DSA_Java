package Graph;

import java.util.HashSet;

public class Graph_Client {
    public static void main(String[] args) {
        graph_implementation g=new graph_implementation(7);
        g.AddEdge(1,4,6);
        g.AddEdge(1,2,10);
        g.AddEdge(2,3,7);
        g.AddEdge(3,4,5);
        g.AddEdge(4,5,1);
        g.AddEdge(5,6,4);
        g.AddEdge(7,5,2);
        g.AddEdge(6,7,3);
        System.out.println(g.ContainsEdge(1,4));
        System.out.println(g.Containsvertex(1));
        System.out.println(g.noofedges());
        g.Display();
        System.out.println(g.haspath(1,6, new HashSet<>()));
        g.printallpath(1,6,new HashSet<>(),"");

    }


}
