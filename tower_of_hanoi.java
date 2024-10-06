public class tower_of_hanoi {
    public static void main(String[] args) {
        int n =3;
        hanoi(n,"A","B","C");
    }
    public static void hanoi(int n,String src,String help, String dest){
        if(n==0){
            return;
        }
        hanoi(n-1,src,dest,help);

    System.out.println("Move " + n+"th "+"disc from " + src+ " to "+ dest);
        hanoi(n-1,help,src,dest);
    }
}
