
import java.util.*;

public class Subsequence {

   public static void sq(int ind, ArrayList<Integer> ds, int arr[], int n, int s, int sum) {
        if (ind == n) {
            if (s == sum) {
                System.out.println(ds);
            }
            // if(ds.size()==0){
            //     System.out.println("{}");
            // }
            return;
        }

        ds.add(arr[ind]);
        s += arr[ind];
        sq(ind + 1, ds, arr, n, s, sum);

        s -= arr[ind];
        ds.removeLast();
        // not pick
        sq(ind + 1, ds, arr, n, s, sum);

    }

    public static int sqCount(int ind, int arr[], int n, int s, int sum) {
        if (ind == n) {
            if (s == sum) {
                // System.out.println(ds);
                return 1;
            }
            // if(ds.size()==0){
            //     System.out.println("{}");
            // }
            return 0;
        }
        s += arr[ind];// pick up
        int l = sqCount(ind + 1, arr, n, s, sum);

        s -= arr[ind];

        // not pick
        int r = sqCount(ind + 1, arr, n, s, sum);
        return l + r;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ds = new ArrayList<>();
        int arr[] = new int[]{3, 1, 1};
        //sq(0,ds,arr,3,0,4);
        System.out.println(sqCount(0, arr, 3, 0, 4));
    }
}
