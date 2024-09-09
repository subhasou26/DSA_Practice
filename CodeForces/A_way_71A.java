
import java.util.*;
public class A_way_71A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String prob[]=new String[n];
        sc.nextLine();
        for(int i=0;i<n;i++){
            prob[i]=sc.nextLine();
        }
        String ans[]=new String[n];
        for(int i=0;i<n;i++){
            String temp=prob[i];
            if(temp.length()>10){
                int rem=temp.length()-2;
                String x=temp.substring(0, 1)+rem+temp.substring(temp.length()-1);
                ans[i]=x;
            }
            else{
                ans[i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(ans[i]);
        }
    }
}
