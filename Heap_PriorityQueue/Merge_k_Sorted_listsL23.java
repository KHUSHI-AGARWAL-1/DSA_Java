package Heap_PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Merge_k_Sorted_listsL23 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue<ListNode> pq=new PriorityQueue<>(new Comparator<ListNode>() {
                @Override
                public int compare(ListNode o1, ListNode o2) {
                    return o1.val- o2.val;
                }
            });
            for (ListNode ll:lists){
                if(ll!=null){
                    pq.add(ll);
                }
            }
            ListNode dummy=new ListNode();
            ListNode temp=dummy;
            while (!pq.isEmpty()){
                ListNode rv=pq.poll();
                dummy.next=rv;
                dummy=dummy.next;
                if(rv.next!=null){
                    pq.add(rv.next);
                }
            }
            return temp.next;
        }
    }
}
