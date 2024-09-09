public class first_letter_uppercase {
    // leetcode 2129
public static String toUppercase(String str){
    StringBuilder sb=new StringBuilder("");
    char ch=Character.toUpperCase(str.charAt(0));
    sb.append(ch);
    for(int i=1;i<str.length();i++){
        if(str.charAt(i)==' ' && i<str.length()-1){
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        }
        else{
            sb.append(str.charAt(i));
            
        }
    }
    return sb.toString();
}


public static String capitalize(String str){
    StringBuilder sb=new StringBuilder(str.toLowerCase());
    int start=0,end=0;
    while(end<sb.length()){
        while(end<sb.length() && sb.charAt(end)!=' '){
            ++end;
        }
        int length=end-start;
        System.out.println(length);
        if(length>2){
         sb.setCharAt(start,Character.toUpperCase(sb.charAt(start)));
        }
   
      //  System.out.println(start);
        start=end+1;
        ++end;
    }
    return sb.toString();
}
    public static void main(String[] args) {
        String  str="l CCK n k";
       
        String ans=capitalize(str);
        System.out.println(ans);
    }
}
