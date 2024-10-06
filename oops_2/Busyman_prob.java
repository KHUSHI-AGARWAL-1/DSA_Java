package oops_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//activity management problems
public class Busyman_prob { //start point ya end point ke basis pr sort
    // krte h or next ke start se match dekhenge ...agr matched to valid else not

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            pair[] ar=new pair[n];
            for (int i=0;i< ar.length;i++){
                int start= sc.nextInt();
                int end= sc.nextInt();
                ar[i]=new pair(start,end);
            }
            Arrays.sort(ar, new Comparator<pair>() {
                @Override
                public int compare(pair o1, pair o2) {

                    return o1.end-o2.end;
                }
            });
            int activity=1;
            int end=ar[0].end;
            for (int i = 0; i < ar.length; i++) {
                if (ar[i].start >= end){
                    activity++;
                    end=ar[i].end;

                }
            }
            System.out.println(activity);
        }
    }
    static class pair{
        int start;
        int end;
        public pair(int start,int end){
            this.start=start;
            this.end=end;
        }

    }
}
