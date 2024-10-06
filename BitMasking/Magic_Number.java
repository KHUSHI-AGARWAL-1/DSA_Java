package BitMasking;

public class Magic_Number {
    //magic num is defined as a num which can be expressed as power of 5 or sum of uniques power of 5.
    //Ex: 5,25,30(25+5),125,130(125+5)....
    //write func to find nth magic num..
    //i/p:2 ...op=25
    public static void main(String[] args) {
      int n=1;
      int sum=0;
      int mul=5;
        while(n>0){
            if((n&1)==1){
                sum+=mul;
            }
            mul*=5;
            n>>=1;
        }
        System.out.println(sum);
    }
}
