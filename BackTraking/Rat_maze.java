
import java.util.*;

public class Rat_maze {
    public static boolean isSafe(int grid[][],int row,int col){
        return(row>=0 && row<grid.length && col>=0 && col<grid.length && grid[row][col]==1);
    }

    public static boolean ways(int grid[][],int i,int j,int sol[][],int col,int row){
        // base case
        if(i==row-1 && j==col-1){ // in last position
            sol[i][j]=1;
            return true;
        }
         // recursion
      if(isSafe(grid, i, j)==true){
         if(sol[i][j]==1){
             return false;
         }
        sol[i][j]=1;
        if(ways(grid, i, j+1, sol, col, row)){
            return true;
        }
        if(ways(grid, i+1, j, sol, col, row)){
            return true;
        }
        sol[i][j]=0; // back traking
        return false;
      }
       
        return false;
    }
    public static void print(int grid[][]){
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int grid[][] = {{1, 1, 0, 0},
                        {1, 1, 0, 1},
                        {0, 1, 0, 0},
                        {1, 1, 1, 1}};
        int sol[][]={{0,0, 0, 0},
                    {0, 0, 0, 0},
                    {0, 0, 0, 0},
                    {0, 0, 0, 0}};                
        System.out.println(ways(grid, 0, 0,sol, 4, 4)); 
        print(sol);    
        int arr[]={10,20,30,40,50};
       System.out.println( Arrays.binarySearch(arr, 30));
    }
}
