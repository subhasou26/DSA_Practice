
import java.util.HashMap;
import java.util.Map;

public class StringHash {
    public static void count(int arr[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        for(Map.Entry entry :map.entrySet()){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
    }
    public static void main(String[] args) {
        // Scanner Sc=new Scanner(System.in);
        // String str=Sc.nextLine();
        // int hash[]=new int[26];

        // for(int i=0;i<str.length();i++){
        //     hash[(int)str.charAt(i)-'a']++;
        // }

        // for(int i=0;i<hash.length;i++){
        //     System.out.print(hash[i]);
        // }
        int arr[]={1,1,1,0,2,1,0,2,2,2};
        count(arr);
    }
}
