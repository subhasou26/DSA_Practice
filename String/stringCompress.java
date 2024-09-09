public class stringCompress {
    public static String compress(String str){
        String sb="";
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb+=str.charAt(i);
            if(count>1){
                sb+=count.toString();
            }
        }
        return sb;
    }
    public static void main(String[] args) {
        String str="abc";
        System.out.println(compress(str));
    }
}
