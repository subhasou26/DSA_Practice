import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.*;
public class Activity_selection {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        List<Integer> a=new ArrayList<>();

        //sorting
        int activitis[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activitis[i][0]=i;
            activitis[i][1]=start[i];
            activitis[i][2]=end[i];
        }
        // lamda function
        Arrays.sort(activitis,Comparator.comparingDouble(o->o[2])); 

        // sorted basis of end time
        int max_activity=0;
        ArrayList<Integer>ans=new ArrayList<>();
        

        // 1St activity
        max_activity=1;
        ans.add(activitis[0][0]);
        int lastEnd=activitis[0][2];
        for(int i=0;i<end.length;i++){
            if(activitis[i][1]>=lastEnd){
                // activity select || non overlaping
                max_activity++;
                ans.add(activitis[i][0]);
                lastEnd=activitis[i][2];
            }
        }

        System.out.println("max activity= "+max_activity);
        System.out.println(ans);
    }
}
