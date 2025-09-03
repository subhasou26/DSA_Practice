import java.util.*;
public class First{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n-->0){
            int car=sc.nextInt();
            int bike=sc.nextInt();
            sum+=(car*4)+(bike*2);
        }
        System.out.println(sum);
    }
}