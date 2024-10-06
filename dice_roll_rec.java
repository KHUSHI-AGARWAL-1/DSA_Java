public class dice_roll_rec {
    public static void main(String[] args) {
        int n=3;
        print_path(0,n,"");
    }
    public static void print_path(int src,int des,String ans){
        int s=0;
        if(src==des){
           System.out.print(ans+" ");
            return ;
        }
        if(src>des){
            return ;
        }
//        print_path(src+1,des,ans+1);
//        print_path(src+2,des,ans+2);
//        print_path(src+3,des,ans+3);
        for(int i=1;i<=3;i++){
            print_path(src+i,des,ans+i);
        }
//        return s;
    }
}
