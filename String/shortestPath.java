import java.util.*;
public class shortestPath {
    public static float getPath(String s){
        int x=0,y=0;
        for(int i=0;i<s.length();i++){
            char dir=s.charAt(i);

            // North
            if(dir=='N'){
                y++;
            }
            else if(dir=='S'){
                y--;
            }
            else if(dir=='E'){
                x++;
            }
            else{
                x--;
            }
        }
        System.out.println("X cordinate "+x);
        System.out.println("y cordinate "+y);
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String args[]){
            String str="SSSNEEEW";
            System.out.println(getPath(str));
    }
}
