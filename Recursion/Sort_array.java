import java.util.ArrayList;

public class Sort_array {
    
    public static void sort(ArrayList<Integer> arr){
        if(arr.size()==1){return;} // base condition

        // induction
        int temp=arr.get(arr.size()-1); 
        arr.removeLast();

        sort(arr); // hypothesis

        insert(arr,temp);
    }

    public static void insert(ArrayList<Integer>arr,int temp){
        if(arr.size()==0 || arr.get(arr.size()-1)<=temp){
            arr.add(temp);
            return;
        }
        int val=arr.get(arr.size()-1);
        arr.removeLast();
        insert(arr, temp);
        arr.add(val);
    }
    public static void main(String[] args) {
        
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(2);
        arr.add(7);
        arr.add(6);
        arr.add(4);
        System.out.println(arr);
        sort(arr);
        System.out.println(arr);
    }
}
