import java.util.Scanner;

public class Find_max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int maxDiff=0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                        maxDiff=Math.max(maxDiff,j-i);
                }
            }
        }

        System.out.println(maxDiff);
    }
}
