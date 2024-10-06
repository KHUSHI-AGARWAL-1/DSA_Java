package System_Design;

public class Bike_Client {
    public static void main(String[] args) {
        Vehicle v= new Bike();
        System.out.println(((Bike) v).Turn_Off());
        System.out.println(v.StartEngine());
        System.out.println(v.Vehicle_Engine_type());
    }
}
