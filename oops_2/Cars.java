package oops_2;

public class Cars
// implements Comparable<Cars>
{
    int price;
    int speed;
    String color;
    public Cars(){

    }
    public Cars(int price,int speed,String color) {
        this.speed = speed;
        this.price = price;
        this.color = color;
    }
        @Override
    public String toString(){
        return "P : "+this.price + " S: "+ this.speed + " C: "+this.color;
    }



//    public int compareTo(Cars o) {
////        return this.speed-o.speed; //for increasing
////        return o.price-this.speed; // for decreasing
//        return this.color.compareTo(o.color); //to compare strings...sort alphabeticaaly hoga
//
//    }
}
