public class word_search {
    public static void main(String[] args) {
        char [][] b={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String w="ABCCED";
        for (int i = 0; i <b.length ; i++) {
            for (int j = 0; j <b[0].length ; j++) {
                boolean ans = false;
                if (b[i][j] == w.charAt(0)) {
                    ans = word(b, i, j, w, 0);
                }
                if (ans) {
                    System.out.println(ans);
                    return;
                }
            }
        }
    }
    public static boolean word(char [][] b,int cr,int cc,String w,int idx){
        if(idx==w.length()){
            return true;
        }
        if(cr<0 || cc<0 || cr>=b.length || cc>=b[0].length || b[cr][cc]!=w.charAt(idx))
        {
            return false;
        }
        int[] r={-1,1,0,0};
        int[] c={0,0,-1,1};
        b[cr][cc]='*';
        boolean ans=false;
        for (int i = 0; i <c.length ; i++) {
            ans=word(b,cr+r[i],cc+c[i],w,idx+1);
            if(ans)
                return ans;
        }
       b[cr][cc]=w.charAt(idx);
        return false;
    }

}
