import java.lang.*;
import java.util.*;

class Test
{
    public static boolean check(String str, int n) {
        String v = "aeiou";
        int conso = 0;
        for (int i = 0; i < n; i++) {
            char chars = str.charAt(i);
            if (chars == 'a' || chars == 'e' || chars == 'i' ||
                chars == 'o' || chars == 'u') {
                conso = 0;
            }

            else {
                conso++;
                if (conso == 4) return false;
                
            }
        }
        return true;
    }
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int n = sc.nextInt();
            String str = sc.next();
            if (check(str, n)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            t--;
        }

    }
}