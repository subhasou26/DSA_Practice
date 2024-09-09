
public class print1_to_n {
   static int ans=1;
    public static void print(int n){
        if(n==1){// base condition
            System.out.println(n);
            return;
        } 
        print(n-1); // Hypothesis
        System.out.println(n); // Induction
    }
    public static void print_n_1(int n){
        if(n==1){ // bace case
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        print_n_1(n-1);
    }
    public static int fact(int n){
        if(n==0||n==1){return 1;}
       int fnm1=fact(n-1);
       int fn=n*fnm1;

       return fn;
    }

    public static int sum_to_n(int n){
        if(n==1){
            return 1;
        }
        int sn=n+sum_to_n(n-1);
        return sn;
    }
    public static void main(String[] args) {
       System.out.println(sum_to_n(100));
        
    }
}
