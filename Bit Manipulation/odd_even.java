public class odd_even {
    public static void check(int n){
        int bitMask=1;
        if((n &bitMask)==1 ){
            System.out.println("The number is odd");
        }
        else{
            System.out.println("The number is even");
        }
    }
    public static void main(String[] args) {
        int n=2;
        check(n);
    }
}
