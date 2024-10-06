public class sudoku{
    public static void main(String[] args) {
       int[][] grid={{3,0,6,5,0,8,4,0,0},
               {5,2,0,0,0,0,0,0,0},
                {0,8,7,0,0,0,0,3,1},
                {0,0,3,0,1,0,0,8,0},
                {9,0,0,8,6,3,0,0,5},
                {0,5,0,0,9,0,6,0,0},
                {1,3,0,0,0,0,2,5,0},
                {0,0,0,0,0,0,0,7,4},
                {0,0,5,2,0,6,3,0,0}};
        sudoku(grid,0,0);
    }
    public static void sudoku(int [][] b,int r,int c){
        if(c==9){
            r++;
            c=0;
        }
        if(r==9){
            display(b);
            return;
        }
        if(b[r][c]!=0){
            sudoku(b,r,c+1);
        }
        else{
            for (int val=1;val<=9;val++){
                if(issafe(b,r,c,val)){
                    b[r][c]=val;
                    sudoku(b,r,c+1);
                    b[r][c]=0;
                }
            }
        }
    }
    public static boolean issafe(int [][] b,int row,int col,int val){

        for (int i = 0; i <b.length ; i++) {
            if(b[row][i]==val)
                return false;

        }
        for (int i = 0; i <b.length ; i++) {
            if(b[i][col]==val)
                return false;

        }
        int r=row-row%3;
        int c=col-col%3;
        for (int i = r; i < r+3; i++) {
            for(int j=c;j<c+3;j++){
                if(b[i][j]==val){
                    return false;
                }
            }

        }
return true;
    }
    public static void display(int [][]b){
        for(int i=0;i< b.length;i++){
            for (int j = 0; j <b.length ; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }

        }
