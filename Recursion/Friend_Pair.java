public class Friend_Pair {
    public static int friend_pair(int n){

        if(n==1 || n==2){
            return n;
        }
        // single choice
        int fnm1=friend_pair(n-1);

        // pair ways
        int fnm2=friend_pair(n-2);
         int pairWays=(n-1)*fnm2;

         int totalWays=fnm1+pairWays;

         //return totalWays;

         return friend_pair(n-1)+(n-1)*friend_pair(n-2);


    }
    public static void main(String[] args) {
        System.out.println(friend_pair(3));
    }
}
