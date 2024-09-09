public class Pow {
    public static int optimized(int a,int n){
        if(n==0){
            return 1;
        }
        int temp=optimized(a, n/2);
        int half=temp*temp;
        if(n%2!=0){
            half=a*half;
        }
        return half;
    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        

        return x*power(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(optimized(2, 5));
    }
}
