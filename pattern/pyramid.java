

public class pyramid {
    public static void main(String args[]){
        int i,j,row=6;
        for(i=0;i<row;i++){

            for(j=row-i;j>1;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i=0;i<row;i++){

            for(j=row;j>row-i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<row-i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
