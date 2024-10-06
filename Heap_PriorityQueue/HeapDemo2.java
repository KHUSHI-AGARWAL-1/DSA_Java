package Heap_PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class HeapDemo2 {
    public static void main(String[] args) {
//        PriorityQueue<Integer> pq=new PriorityQueue<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.add(5);
        pq.add(7);
        pq.add(6);
        pq.add(1);
        pq.add(4);
        pq.add(9);
        pq.add(7);
        pq.add(3);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
    }
}
