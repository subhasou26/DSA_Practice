import java.util.LinkedList;
import java.util.Queue;

public class checkifstringRoated {
    public static boolean check(String s, String goal){

        if(s.length()!=goal.length()){
            return false;
        }

        Queue <Character> q1=new LinkedList<>();
        for(int i=0;i<s.length();i++){
            q1.add(s.charAt(i));
        }

        Queue <Character> q2=new LinkedList<>();
        for(int i=0;i<goal.length();i++ ){
            q2.add(goal.charAt(i));
        }

        int k=goal.length()-1;
        while(k>0){
            char ch=q2.peek();
            q2.remove();
            q2.add(ch);
            if(q2.equals(q1)){return true;}
            k--;
        }
        return false;
    }
    public static void main(String[] args) {
        String str1="AACD";
        String str2="ACDC";
        System.out.println(check(str1, str2));
    }
}
