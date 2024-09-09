
import java.util.*;

public class javaBasic {

public static int binary_to_decc(int binary){
  int dcc=0,power=0;
  while(binary!=0){
    int ld=binary%10;
    dcc=dcc+ld*(int)Math.pow(2,power);
    power++;
    binary=binary/10;
  }
  return dcc;
}

public static void dcc_to_binary(int dec){
  int binary=0,power=0;
  while(dec!=0){
    int rem=dec%2;
    binary=binary+rem*(int)Math.pow(10,power);
    power++;
    dec=dec/2;
  }
  System.out.println("Your decimal "+dec+" Binary  is "+binary);
}

 public static int sum(int a,int b){
  return a+b;
 }

 public static float sum(float a, float b){
  return a+b;
 }

 public static void print_prime(int n){
      for(int i=2;i<n;i++){
        if(isPrimme(i)){
          System.out.println(i);
        }
      }
 }
  public static boolean isPrimme(int n){
    if(n==2)return true;
    for(int i=2;i<=Math.sqrt(n);i++){
      if(n%i==0){
        return false;
        
      }
    }
    return true;

  }
  public static void main(String args[]) {
      System.out.println(Math.log10(100.0));
  }

}
// boilerplate code