import java.util.ArrayList;
import java.util.*;
public class introduction {

    static void swap(ArrayList<Integer>list,int ind1,int ind2){
        int temp=list.get(ind1);
        list.set(ind1, list.get(ind2));
        list.set(ind2, temp);
    }
    public static void main(String[] args) {
       ArrayList<Integer> list=new ArrayList<>();
       ArrayList<String> list2=new ArrayList<>();

       list.add(5);
       list.add(3);
       list.add(4);
       System.out.println(list);

    //    list.remove(2);
    //    System.out.println(list);

    //    list.set(0, 10);
    //    System.out.println(list);

          
          System.out.println(list.contains(4));

          // add on the index
        //   list.add(0,55);
        //   System.out.println(list);

        // System.out.println(list.size());

        
        // swap(list, 0, 1);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
