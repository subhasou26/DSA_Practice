import java.util.Arrays;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            builder.append(ch);
        }
       System.out.println(builder.toString());
      
       System.out.println( builder.substring(0, 5));
       String name="subhadip,saheli,riha";
      System.out.println(Arrays.toString( name.split("")));
    }
}
