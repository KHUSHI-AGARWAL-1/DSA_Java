public class str_permutatiion_rec {
    public static void main(String[] args) {
        String ques="cab";
        permut(ques,"");
    }
    public static void permut(String ques,String ans){
        if(ques.length()==0){
            System.out.print(ans+" ");
            return;
        }
        for (int i = 0; i <ques.length() ; i++) {

            String s1=ques.substring(0,i);
            String s2=ques.substring(i+1);
            char ch= ques.charAt(i);
//
            permut(s1+s2,ans+ch);

        }
    }
}
//    abc
//            acb
//    bac
//            bca