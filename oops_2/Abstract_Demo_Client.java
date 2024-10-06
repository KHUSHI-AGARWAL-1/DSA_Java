package oops_2;

public class Abstract_Demo_Client {
    public static void main(String[] args) {
//        Abstract_Demo ab=new Abstract_Demo();
        Payment_Demo py=new Payment_Demo();
        Abstract_Demo ab1=new Abstract_Demo() {
            @Override
            public void Payment() {

            }
        };

    }
}
