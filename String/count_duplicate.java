import java.util.*;
public class count_duplicate {
    public static void printDuplicate(String str){
        int n=str.length();
        char [] arr=str.toCharArray();
        Arrays.sort(arr);
        String sortedstr=new String(arr);

        for(int i=0;i<n;i++){
            int count=1;
            while(i<n-1 && sortedstr.charAt(i)==sortedstr.charAt(i+1)){
                    count++;
                    i++;
            }

            if(count>1){
                System.out.println(sortedstr.charAt(i)+", count= "+count);
            }
        }
    }
    public static void main(String[] args) {
        String str="subhadip paul";
        printDuplicate(str);
    }
}
