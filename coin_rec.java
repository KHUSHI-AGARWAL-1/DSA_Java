public class coin_rec {
    public static void main(String[] args) {
        int n=3;
        coin(n,"");
        cointoss(n,"");
        System.out.println(cointoss1(n,""));
    }
    public static void coin(int n,String s1){
        if(s1.length()==n) {
            System.out.println(s1);
            return;
        }
        coin(n,s1+"H");
        coin(n,s1+"T");

    }
//   2. display combination not starting with "HH"
    public static void cointoss(int n,String s1){
        if(s1.length()==n) {
            System.out.println(s1);
            return;
        }
        if(s1.length()==0  || s1.charAt(s1.length()-1)!='H')
            cointoss(n,s1+"H");
        cointoss(n,s1+"T");

    }
//    3. count observations not continuous "HH"
    public static int cointoss1(int n,String s1){
        if(s1.length()==n) {
            //System.out.println(s1);
            return 1;
        }
        int a=0;
        if(s1.length()==0  || s1.charAt(s1.length()-1)!='H'){
             a =cointoss1(n,s1+"H");

        }
        int b=cointoss1(n,s1+"T");
        return a+b;

    }
}
