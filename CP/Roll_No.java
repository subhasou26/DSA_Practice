
import java.util.Scanner;

public class Roll_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int arr_size = sc.nextInt();
            int roll_no[] = new int[arr_size];
            for(int j=0;j<arr_size;j++){
                roll_no[j]=sc.nextInt();
            }

            for(int k=0;k<arr_size;k=k+2){
                System.out.print(roll_no[k]+" ");
            }
            System.out.println();
        }

    }
}
