package System_Design;

public class Bike implements Vehicle {
    boolean Turn_On;
    int accl;

    @Override
    public boolean StartEngine() {
        Turn_On=true;
        return Turn_On;
    }

    @Override
    public int Accelerate() {
        return accl*10;
    }

    @Override
    public Vehicle Vehicle_Engine_type(){ //yha hm vehivle return type m
        // child ko ret kr paa rhe h without any chnge thn its following lis
        return new Bike();
    }
    public boolean Turn_Off(){
        Turn_On=false;
        return Turn_On;
    }
    public String toString(){
        return "KTM Bike ka Engine";
    }
}
