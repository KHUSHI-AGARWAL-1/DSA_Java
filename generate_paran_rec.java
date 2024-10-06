import java.util.ArrayList;
import java.util.List;

public class generate_paran_rec {
    public static void main(String[] args) {
        int n=3;
        List<String> str= new ArrayList<>();
        paranthesis(n,"",0,0,str);
        System.out.println(str);
    }
    public static void paranthesis(int n, String ans,int oc,int cc,List<String> str){
        if(oc== n && cc==n){
//            System.out.print(ans+" ");
//            str.add(ans);
            return;
        }
        if(oc<n){
            paranthesis(n,ans+"(",oc+1,cc,str);
        }
        if(cc<oc){
            paranthesis(n,ans+")",oc,cc+1,str);
        }
    }
}
