package Heap_PriorityQueue;

import java.util.PriorityQueue;

public class Merging_Rope {
    // ques: we are given set of ropes we have to find the min cost by merging all ropes.
    //ex: [2 3  4  1 5]
    // 2+1 =3 [3 3 4  5]
    // 3+3=6 [6 4 5]
    //4+5 =9 [6 9]
    //6+9=15 [15]
    // total:3+ 6 +9+15=33
    public static void main(String[] args) {
        int[] arr={2,3,4,1,5 };
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        int sum=0;
        while (pq.size()>1){
            int a=pq.poll();
            int b= pq.poll();
            sum=sum+a+b;
            pq.add(a+b);
        }
        System.out.println(sum);
    }

}
