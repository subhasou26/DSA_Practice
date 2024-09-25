public class NQueen {
    public static boolean isSafe(char bord[][],int row,int col){
        // vertical up
        for(int i=row-1;i>=0;i--){
            if(bord[i][col]=='Q'){
                return false;
            }
        }

        // diag left up

        for(int i=row-1,j=col-1;i>=0 && j>=0 ;i--,j--){
            if(bord[i][j]=='Q'){
                return false;
            }
        }
        // diag right up

        for(int i=row-1,j=col+1;i>=0 && j<bord.length;i--,j++){
            if(bord[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static boolean nQueen(char bord[][],int row){
        // base case
        if(row==bord.length){
            printBord(bord);
            return true;
        }

        for(int i=0;i<bord.length;i++){
            if(isSafe(bord,row,i)){
                bord[row][i]='Q';
                if(nQueen(bord, row+1)){
                    return true;
                }// recursion
                bord[row][i]='Y'; // back traking
            }
           
           
        }
        return false;
    }
    public static void printBord(char bord[][]){
        System.out.println("-------chese bord---------");
        for(int i=0;i<bord.length;i++){
            for(int j=0;j<bord.length;j++){
                System.out.print(bord[i][j]+" ");

            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int n=4;
        char [][] bord=new char[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                bord[i][j]='x';
            }
        }
        nQueen(bord,0); // this code print only one solution
    }
}
