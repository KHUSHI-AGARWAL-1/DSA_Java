package BitMasking;

public class Set_Bit {
    //tell whether the given pos bit is set/unset
    public static void main(String[] args) {
        int n=67;
        int pos=3;
        int mask=(1<<pos);
        if((n&mask)==0){
            System.out.println("unSet");
        }
        else{
            System.out.println("set");
        }
    }
}
