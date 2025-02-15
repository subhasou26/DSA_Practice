import java.util.ArrayList;

public class Sub_set {
   public static ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
    public static void subSet(int ind,ArrayList<Integer> ds,int arr[],int n){
        if(ind==n){
            
           ans.add(ds);
           System.out.println(ans);
            if(ds.isEmpty()){
                ans.add(new ArrayList<>());
            }
            return;
        }
        // pick
        ds.add(arr[ind]);
        subSet(ind+1, ds, arr, n);
        ds.removeLast();
        subSet(ind+1, ds, arr, n);
       
        
    }
    public static void main(String[] args) {
        int arr[]=new int[]{3,1,2};
        ArrayList<Integer> ds=new ArrayList<>();
        
        subSet(0, ds, arr, 3);
        System.out.println(ans);
    }
}
