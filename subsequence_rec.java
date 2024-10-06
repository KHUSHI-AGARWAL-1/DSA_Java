public class subsequence_rec {
    public static void main(String[] args) {
        String str="abcd";
        String ans="";
      // subscount(str,ans);
       // System.out.println("\n"+c);
        subs(str,ans);
//        int count=subscount1(str,ans);
//        System.out.println("\n"+count);
    }
    public static void subs(String str,String ans){
        if(str.length()==0){
            System.out.print(ans+" ");
            return;
        }
        char ch=str.charAt(0);
        subs(str.substring(1),ans);
        subs(str.substring(1),ans+ch);

    }
//    static int c=0;
//    public static void subscount(String str,String ans){
//        if(str.length()==0){
//            System.out.print(ans+" ");
//            c++;
//            return;
//        }
//        char ch=str.charAt(0);
//        subscount(str.substring(1),ans);
//        subscount(str.substring(1),ans+ch);
//    }
//    public static int subscount1(String str,String ans){
//        if(str.length()==0){
//            return 1;
//        }
//        char ch=str.charAt(0);
//        int a=subscount1(str.substring(1),ans);
//        int b=subscount1(str.substring(1),ans+ch);
//        return a+b;
//    }
}
