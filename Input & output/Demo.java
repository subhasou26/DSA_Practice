import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {
        
        // InputStreamReader in=new InputStreamReader(System.in);
        // BufferedReader bf=new BufferedReader(in); 
        // int num=Integer.parseInt(bf.readLine());
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(num);
        sc.close();
       // bf.close();;
    }
}
