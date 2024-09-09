public class getIthBit {
    public static int getIth(int n,int i){
        int bitMask=1<<i;
        if((n&bitMask)==0)
            return 0;
        return 1;    
    }
    public static int setIth(int n, int i){
        int bitMask=1<<i;
        return (n|bitMask);
    }
    public static int clearIth(int n, int i){
        int bitMask=~(1<<i);
        return n&bitMask;
    }
    public static int updateIth(int n, int i, int newBit){
        n=clearIth(n, i);
        int bitMask=newBit<<i;
        return n|bitMask;
    }
    public static int clearlastIth(int n,int i){
        int bitMask=(~0)<<i;
        return n&bitMask;
    }
    public static int rangeClear(int n, int i, int j){
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int bitMask=a|b;
        return n&bitMask;
    }
    public static boolean isPoweroftwo(int n){
        return (n&(n-1))==0;
    }
    public static int fastExponet(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n>>=1;
        }
        return ans;
    }
    public static void incriment(int n){
        System.out.println(-(~n));
    }
    public static void main(String[] args) {
       // System.out.println(isPoweroftwo(3));
     
        incriment(5);
    }
}
