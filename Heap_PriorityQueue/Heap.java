package Heap_PriorityQueue;
//Min Heap
import java.util.ArrayList;

public class Heap {
    private ArrayList<Integer> list;
    public Heap(){
        list=new ArrayList<>();
    }
    public void Add(int item){
        list.add(item);
        upheapify(list.size()-1); //index bhej rhe h
    }

    private void upheapify(int ci) { //upar heap maintain krega
      int pi=(ci-1)/2; //parent nikal rhe h child ka
      if(list.get(pi)>list.get(ci)){
          swap(pi,ci);
          upheapify(pi);
      }
    }
    public void swap(int pi,int ci){
        int temp=list.get(pi);
        list.set(pi, list.get(ci));
        list.set(ci,temp);
    }
    public int remove(){
        int rv=list.get(0);
        swap(0,list.size()-1 );
        list.remove(list.size()-1);
        downheapify(0);
        return rv;
    }

    private void downheapify(int pi) { //neeche heap maintain krega
         int lci=2*pi+1;
        int rci=2*pi+2;
        int mini=pi;
        if(lci< list.size()-1 && list.get(lci)< list.get(mini)){
            mini=lci;
        }
        if(rci< list.size()-1 && list.get(rci)< list.get(mini)){
            mini=rci;
        }
        if(mini!=pi){
            swap(mini,pi);
            downheapify(mini);
        }
    }

    public int get(){ //to get min of minHeap
        return list.get(0);
    }
    public void Display(){
        System.out.println(list);
    }
}
