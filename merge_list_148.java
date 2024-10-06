//public class merge_list_148 {
//    public class ListNode {
//        int val;
//        ListNode next;
//        ListNode() {}
//        ListNode(int val) { this.val = val; }
//        ListNode(int val, ListNode next) {
//            this.val = val;
//            this.next = next;
//        }
//    }
//
//    class Solution {
//        public ListNode sortList(ListNode head) {
//            if(head==null || head.next==null) {
//                return head;
//            }
//            ListNode mid=middleNode(head);
//            ListNode midnext=mid.next;
//            mid.next=null;
//            ListNode A=sortList(head);
//            ListNode B=sortList(midnext);
//           // return  //merge_two_sorted_list(A,B);
//        }
//
//    }
//    public ListNode middleNode(ListNode head){
//        ListNode slow=head;
//        ListNode fast=head;
//        while( fast.next!=null && fast.next.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//        }
//        return slow;
//    }
//}
//
