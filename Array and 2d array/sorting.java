import java.lang.reflect.Array;
import java.util.*;
import java.util.Collections;
public class sorting {
    public static void bubbl_sort(int arr[]){
        int swaps;
        for(int i=0;i<arr.length-1;i++){
            swaps=0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                swaps++;
            }
            if(swaps==0){
                break;
            }
        }
    }

    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            // now the swap
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;

        }
    }
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1; 
            // finding the currect position to insert
            while(prev>=0&&arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            // insert
            arr[prev+1]=curr;
        }
    }
    public static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);
        }
        int countArray[]=new int[largest+1];

       for(int i=0;i<arr.length;i++){
            countArray[arr[i]]++;
       }
       // sortuing
       int j=0;
       for(int i=0;i<countArray.length;i++){
        while(countArray[i]>0){
            arr[j]=i;
            j++;
            countArray[i]--;
        }
       }
    }
    public static void main(String args[]){
        int arr[]={1,4,1,3,2,4,3,7};
                countingSort(arr);

        // Arrays.sort(arr,Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
         }
    }
}
