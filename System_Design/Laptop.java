package System_Design;

public class Laptop {
//    private Wire_KeyBoard keyBoard;
//    private  Wire_Mouse mouse;
//    public Laptop(Wire_KeyBoard key, Wire_Mouse mouse){
//        this.keyBoard=key;
//        this.mouse=mouse;
//    }
private KeyBoard keyBoard;
    private  Mouse mouse;
    public Laptop(KeyBoard key, Mouse mouse){
        this.keyBoard=key;
        this.mouse=mouse;
    }

    public static void main(String[] args) {
        Laptop ll= new Laptop(new Wire_KeyBoard(),new Wireless_Mouse());
    }
}
