public class Sudoku {
    public static boolean isSafe(int bord[][],int row,int col,int digit){
        // column
        for(int i=0;i<=8;i++){
            if(bord[i][col]==digit){
                return false;
            }
        }

        // row
        for(int i=0;i<=8;i++){
            if(bord[row][i]==digit){
                return false;
            }
        }

        // grid

        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(bord[i][j]==digit){
                    return false;
                }
            }
        }

        return true;

    }
    public static boolean solve_soduku(int bord[][],int row,int col){
        //base case
        if(row==9){
            return true;
        }
       

        //recursion
        int nextRow=row,nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }

        if(bord[row][col]!=0){
            return solve_soduku(bord, nextRow, nextCol);
        }

        for(int digit=1;digit<=9;digit++){
            if(isSafe(bord,row,col,digit)){
                bord[row][col]=digit;
                if(solve_soduku(bord, nextRow, nextCol)){
                    return true;
                }
                bord[row][col]=0;
            }
        }
        return false;
    }
    public static void print_suduku(int grid[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int grid[][]=
        { {3, 0, 6, 5, 0, 8, 4, 0, 0},
        {5, 2, 0, 0, 0, 0, 0, 0, 0},
        {0, 8, 7, 0, 0, 0, 0, 3, 1},
        {0, 0, 3, 0, 1, 0, 0, 8, 0},
        {9, 0, 0, 8, 6, 3, 0, 0, 5},
        {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
        {1, 3, 0, 0, 0, 0, 2, 5, 0},
        {0, 0, 0, 0, 0, 0, 0, 7, 4},
        {0, 0, 5, 2, 0, 6, 3, 0, 0} };
        System.out.println(solve_soduku(grid, 0, 0));
        print_suduku(grid);
    }
    
}
