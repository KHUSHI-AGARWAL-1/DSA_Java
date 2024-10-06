import java.util.Scanner;
// You are given number of pages in n different books and m students. The books are arranged in
//ascending order of number of pages. Every student is assigned to read some consecutive books.
// The task is to assign books in such a way that the maximum number of pages assigned to a student
// is minimum.
public class Book_Allocation_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
    int n= sc.nextInt(); // no.of books
    int m = sc.nextInt(); // no.of students
    int []page=new int[n];
    for(int i=0;i<n;i++){
     page[i]= sc.nextInt();

}
            System.out.println(book_allocation(page,m));
        }
    }

    private static int book_allocation(int[] page,int nos) {
            int lo=0;
            int hi=0;
            for(int val:page){
                hi=hi+val;
            }
            int ans=0;
            while(lo<=hi){
                int mid=(lo+hi)/2;
                if(isitpossible(page,nos,mid)){
                    ans=mid;
                    hi=hi-1;
                }
                else {
                    lo=mid+1;
                }
            }
            return ans;
    }

    private static boolean isitpossible(int[] page, int nos, int mid) {
        int student=1;
        int readpage=0;
        int i=0;
        while(i<page.length){
            if(readpage+page[i]<=mid){
                readpage+=page[i];
                i++;
            }
            else{
                student++;
                readpage=0;
            }
            if(student>nos){
                return false;
            }
        }


        return true;
    }
}
