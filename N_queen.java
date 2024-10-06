public class N_queen {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] b = new boolean[n][n];
        nqueen(b, 0, n);

    }

    public static void nqueen(boolean[][] b, int r, int tq) {
        if (tq == 0) {
            print(b);
            System.out.println();
            return;
        }

        for (int c = 0; c < b.length; c++) {
            if (issafe(b, r, c) == true) {
                b[r][c] = true;
                nqueen(b, r + 1, tq - 1);
                b[r][c] = false;
            }
        }
    }
    public static boolean issafe(boolean[][] b,int r,int c){
        int row=r;
        while(row>=0){
            if(b[row][c]){
                return false;
            }
            r--;
        }
        row=r;
       int  col=c;
        while(row>=0&& col>=0){
            if(b[row][col]){
                return false;
            }
            row--;
            col--;

        }
        row=r;
          col=c;
        while(row>=0&& col>=0){
            if(b[row][col]){
                return false;
            }
            row--;
            col++;

        }
        return true;
    }
    public static void print(boolean[][] b){
        for(int i=0;i< b.length;i++){
            for (int j = 0; j <b.length ; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
