
import java.util.*;

public class Gym {
    private static int gym(int e,int n,int arr[]){
        Arrays.sort(arr);
        int count=0;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<2;j++){
                e-=arr[i];
                if(e<=0) return count+1;
                count++;
            }
            if(e<=0) return count;
        }
        return -1;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int e=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(gym(e,n,arr));
    }
} 