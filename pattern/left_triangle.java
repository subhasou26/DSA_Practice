

public class left_triangle {
    public static void main(String args[]){
        int i,j,row=6;

        for( i=0;i<row;i++){
            // loop for the row

            for(j=row-i;j>0;j--){
                System.out.print(" ");
            }
             for(int k=0;k<=i;k++){
                System.out.print("*");
             }
             System.out.println();
        }
    }
}
