public class queen_permut {
    public static void main(String[] args) {
        int n=4;
        int q=2;
        boolean [] board = new boolean[4];
        permut(board,q,0,"",0);
    }
    public static void permut(boolean[] board,int tq,int qpsf ,String ans,int idx)
    {
        if(qpsf==tq){
            System.out.println(ans);
            return;
        }
        for(int i=idx;i< board.length;i++){
            if(board[i]== false){
                board[i]=true;
                permut(board,tq,qpsf+1,ans+" b"+i+"q"+qpsf,i+1);
                board[i]=false;
            }
        }
    }
}
