public class matrix_q {
  public static  int no_of_seven(int arr[][]){
        int countSeven=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==7){
                    countSeven++;
                }
            }
        }
        return countSeven;
    }
    public static void arraySum(int arr[][]){
        int sum=0;
        for(int i=0;i<arr[0].length;i++){
            sum+=arr[1][i];
        }
        System.out.println("The sum is "+sum);
    }
    public static void transpose(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        int trans_arr[][]=new int[3][2];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                trans_arr[j][i]=arr[i][j];
            }
        }
        printmatrix(trans_arr);
        
    }
    public static void printmatrix(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[][]={ {4,7,8},{8,8,7} };
        int nums[][]={ {1,4,9},{11,4,3},{2,2,3} };
       //int ans=no_of_seven(arr);
       //arraySum(nums);
        //System.out.println(ans);
        transpose(arr);
       //printmatrix(nums);
    }
}
