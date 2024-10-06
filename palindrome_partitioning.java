import java.util.ArrayList;
import java.util.List;

public class palindrome_partitioning {
    public static void main(String[] args) {
        String ques="nitin";
        String ans="";
        List<String> ll=new ArrayList<>();

        palindrome(ques,ll);


    }
    public static void palindrome(String ques,List<String>ll ){
            if(ques.length()==0){
            System.out.println(ll);
                 return;
            }
        for (int i = 1; i <=ques.length() ; i++) {
            String part =ques.substring(0,i);
            if(ispalindrome(part)){
                ll.add(part);

                palindrome(ques.substring(i),ll);
                ll.remove(ll.size()-1);
            }


        }
        }
        public static boolean ispalindrome(String part){
int i=0;
int j= part.length()-1;
while(i<j){
    if(part.charAt(i)!=part.charAt(j))
        return false;
    i++;
    j--;
}
return true;
        }

}
