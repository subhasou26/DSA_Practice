import java.util.Arrays;

public class Remove_duplicate {
    public static void remove(String str,int idx,boolean  map [],StringBuilder sb){
        if(idx==str.length()){
         
            System.out.println(sb);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            remove(str, idx+1, map, sb);
        }
        else{
            map[currChar-'a']=true;
            remove(str, idx, map, sb.append(currChar));
        }
       
    }
    public static void main(String args[]){
        String str="bcabc";
      remove(str, 0, new boolean[26], new StringBuilder(""));
      
    }
}
