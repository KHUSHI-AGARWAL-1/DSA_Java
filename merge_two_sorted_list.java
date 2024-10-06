//public class merge_two_sorted_list {
//    public class ListNode {
//        int val;
//        ListNode next;
//        ListNode() {}
//        ListNode(int val) { this.val = val; }
//        ListNode(int val, ListNode next) {
//            this.val = val;
//            this.next = next; }
//    }
//    class Solution {
//        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//            ListNode a = list1;
//            ListNode b = list2;
//            ListNode dummy = new ListNode();
//            ListNode temp = dummy;
//            while (a != null && b != null) {
//                if (a.val < b.val) {
//                    dummy.next = a;
//                    dummy = dummy.next;
//                    a = a.next;
//                } else
//                    dummy.next = b;
//                dummy = dummy.next;
//                b = b.next;
//                if (a != null) {
//                    dummy.next = a;
//                    if (b != null) {
//                        dummy.next = b;
//
//                    }
//                }
//
//            }
//            return temp.next;
//        }
//    }
//
//
//
