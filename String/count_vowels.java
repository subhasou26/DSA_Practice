import java.util.*;
public class count_vowels{
    
    public static boolean check(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        return false;
    }

    public static int count(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(check(str.charAt(i)))
                count++;
        }
        return count;

    }
    public static void main(String[] args) {
        // Scanner Sc=new Scanner(System.in);
        // System.out.println("Enter String");

        // String str=Sc.nextLine();
        // System.out.println(count(str));
        String str="ShradhaDidi";
        String str1="ApnaCollege";
        String str2="ShradhaDidi";
        System.out.println(str.equals(str1) +" "+str.equals(str2));
    }
}