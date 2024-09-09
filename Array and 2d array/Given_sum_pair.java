import java.util.*;
public class Given_sum_pair {
    public static boolean fn(int arr[],int target){
       // Arrays.sort(arr); // time complexity O(n)
        int low=0,high=arr.length-1;
        while(low<high){
            int sum=arr[low]+arr[high];
            if(sum==target) return true;
            else if(sum<target){
                low++;
            }
            else{
                high --;
            }
        }
        return false;

    }
    public static boolean fn2(int arr[],int target){
        int i;
        int n=arr.length;
        for( i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                break;
            }
        }
        int l=(i+1)%n; // smallest element
        int r=i; //largeest element
        while(l!=r){
            if(arr[l]+arr[r]==target) return true;

            if(arr[l]+arr[r]<target){
                // we need to change smallest element
                l=(l+1)%n;
            }
            else{
                r=(n+r-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={11, 15, 26, 38, 9, 10};
        int target=45;
        System.out.println(fn2(arr, target));

    }
}
