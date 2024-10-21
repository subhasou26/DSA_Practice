
public class Array_pair_1497 {
    public static void help(int arr[],int k){
        int new_arr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            new_arr[i]=((arr[i]%k)+k)%k;
        }
        for(int i=0;i<new_arr.length;i++){
            System.out.print(new_arr[i]+" ");
        }


    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,10,6,7,8,9};
        help(arr, 5);
    }
}
