public class Palindrom {
   public static boolean f(int i,String s){
        if(i>=s.length()/2) return true;
        if(s.charAt(i)!=s.charAt(s.length()-i-1))   return false;

       return f(i+1,s);
    }
    public static void main(String[] args) {
        String str="001100";
        System.out.println(f(0,str));
    }
}
