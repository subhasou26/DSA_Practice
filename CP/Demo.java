import java.util.*;
public class Demo {
    public static int minSwaps(int[] nums) {
        int total_one=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                total_one++;
            }
        }

        int l=0;
        int windows_one=0,max_windows_one=0;
        for(int r=0;r<2*n;r++){
            if(nums[r%n]==1){
                windows_one+=1;
            }
            if(r-l+1>total_one){
                windows_one-=nums[l%n];
                l+=1;
            }
            max_windows_one=Math.max(max_windows_one,windows_one);
        }

        
        return total_one-max_windows_one;
    }
    public static void main(String[] args) {
        int arr[]={1,1,0,0,1};
        System.out.println(minSwaps(arr));
    }
}
