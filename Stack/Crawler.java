import java.util.Stack;

public class Crawler {
    public static int solve(String []logs){
        Stack<String> stk= new Stack<>();  

        for(int i=0;i<logs.length;i++){
            if(logs[i]!="../" && logs[i]!="./"){
                stk.push(logs[i]);
                //System.out.println("After push: "+stk);
            }
            if(!stk.empty()){
                if(logs[i]=="../"){
                    stk.pop();
                    //System.out.println("After pop: "+stk);
                }
            }
        }
        return stk.size();
    }


    public static void main(String[] args) {
        String [] logs={"d1/","../","../","../"};
        System.out.println(solve(logs));

    }
}
