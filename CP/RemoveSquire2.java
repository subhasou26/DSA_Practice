import java.util.ArrayList;
import java.util.Scanner;

public class RemoveSquire2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int ans = 0;
       

        for (int i = 2; i <=n/2 ; i++) {
            if (n % i == 0) {
               
               int flag=1;
                
                for (int j = 2; j <i; j++) {
                    if ( (i%(j * j)) == 0) {
                     // System.out.print(j*j+" ");
                        //ans--;
                        flag=0;
                        break;
                    }
                    
                }
                if(flag==1){
                    ans++;
                }

            }
        }
    
        System.out.println(ans);
       // System.out.println(temp);
       
    }
}
