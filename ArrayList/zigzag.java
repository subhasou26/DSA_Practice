import java.util.ArrayList;
import java.util.List;

public class zigzag {

    public static List<Integer> zigzagWithSkip(int[][] grid) {
        List<Integer> result = new ArrayList<>();
        int rows = grid.length;
        int cols = grid[0].length;

        // Traverse the grid as per the pattern shown in the image
        int  j = 0;

        for(int i=0;i<rows;i++){
            if(i%2==0){
                j=0;
                while(j<cols){
                    if(j%2==0){
                        result.add(grid[i][j]);
                    }
                    j++;
                }
            }
            else{
                j=cols-1;
                while(j>=0){
                    if(j%2!=0){
                        result.add(grid[i][j]);
                    }
                    j--;
                }
            }

        }

        return result;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 2, 1,3},
            { 5,15,7,3},
            {10,4,14,12}
        };

        List<Integer> result = zigzagWithSkip(grid);
        System.out.println(result); // Expected Output: [1, 3, 5, 7, 9]
    }
}
