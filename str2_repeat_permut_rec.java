public class str2_repeat_permut_rec {
    public static void main(String[] args) {
       // when you have repeated characteras in string eliminate the duplicate permutation
        String ques="abca";
        permut(ques,"");
    }
    public static void permut(String ques,String ans) {
        if (ques.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            boolean flag = true;
            for (int j = i+1; j < ques.length(); j++) {
               if(ques.charAt(j)==ch) {
                   flag=false;
                   break;
               }
            }
            if (flag == true) {
                String s1 = ques.substring(0, i);
                String s2 = ques.substring(i + 1);

                permut(s1 + s2, ans + ch);

            }


        }
    }
}
