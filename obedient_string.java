import java.util.Scanner;

public class obedient_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String string= sc.next();

        System.out.println(obedient(string,0));
    }
    public static boolean obedient(String string,int i){
        if(i>=string.length())
            return true;

        if(string.charAt(i)!='a' && string.charAt(i)!='b')
            return false;
        if(string.charAt(i)=='b'){
            if((i< string.length()-1) && string.charAt(i+1)=='b')
                return obedient(string,i+2);
            else
                return false;
        }

        return obedient(string,i+1);
    }
}
