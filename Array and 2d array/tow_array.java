import java.util.*;
public class tow_array {

    public static int digonalsum(int arr[][]){ // 1572
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][i];
            if(i!=arr.length-i-1){
                sum+=arr[i][arr.length-1-i];
            }
            
        }
        return sum;
    }
    public static boolean search_shorted_matrix(int arr[][],int target){
        int row=0,col=arr[0].length-1;
        while(row<arr.length && col >=0){
            if(arr[row][col]==target){
                return true;
            }
            else if(target<arr[row][col]){ // left to matrix
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }

    public static void sprial_matrix(int arr[][]){ //54
        int n=arr.length;
        int m=arr[0].length;
        int srow=0,erow=arr.length-1;
        int scol=0,ecol=arr[0].length-1;
        while(srow<=erow&&scol<=ecol){
            for(int i=scol;i<=ecol;i++){ // top row
                System.out.print(arr[srow][i]+" ");
            }
            for(int i=srow+1;i<=erow;i++){ // right column
                System.out.print(arr[i][ecol]+" ");
            }
            for(int i=ecol-1;i>=scol;i--){ // buttom row
                if(srow==erow){
                    break;
                }
                System.out.print(arr[erow][i]+" ");
            }
            for(int i=erow-1;i>=srow+1;i--){ // left coloum
                if(scol==ecol){
                    break;
                }
                System.out.print(arr[i][scol]+" ");
            }
            srow++;
            scol++;
            erow--;
            ecol--;
        }
    }
    public static void main(String args[]){
        int matrix[][]={{1,4,7,11,15},
            {2,5,8,12,19},
            {3,6,9,16,22},
            {10,13,14,17,24},
            {18,21,23,26,30}};
       
       System.out.print(search_shorted_matrix(matrix, 55));
    }
}
