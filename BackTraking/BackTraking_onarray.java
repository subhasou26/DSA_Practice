
public class BackTraking_onarray {
    public static void findSubset(String str,String ans,int i){
        // base case
        if(i==str.length()){ 
            if(ans.length()==0){
                System.out.println("null");
            }
            System.out.println(ans);
            return;
        }
        // yes choice
        findSubset(str,ans+str.charAt(i),i+1);
        // no choice
        findSubset(str,ans,i+1);
    }
    public static void changeArr(int arr[],int i, int val){
        //base case
        if(i==arr.length){
            printArr(arr);
            return;
        }

        //recursion
        arr[i]=val;
        changeArr(arr, i+1, val+1);
        arr[i]=arr[i]-2;
        
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // int arr[]=new int[5];
        // changeArr(arr, 0, 1);
        // printArr(arr);

        String str ="abc";
        findSubset(str, "", 0);

    }
}
