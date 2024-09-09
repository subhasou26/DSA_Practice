import java.util.*;

public class arraycc {

    public static void reverse(int marks[]) {
        int first=0,last=marks.length-1;
        while(first<last){
            int temp=marks[first];
            marks[first]=marks[last];
            marks[last]=temp;
            first++;
            last--;
        }
    }

    public static int binary_search(int marks[], int key) {
        // array must be sorted
        int front = 0, end = marks.length - 1;
        while (front <= end) {
            int mid = (end + front) / 2;
            if (marks[mid] == key) {
                return mid;
            } else if (marks[mid] < key) {
                front = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }

    public static void update(int marks[], int a) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
        a = 6;
    }

    public static void large(int marks[]) {
        int large = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > large) {
                large = marks[i];
            }
            if (marks[i] < smallest) {
                smallest = marks[i];
            }
        }
        System.out.println(large);
        System.out.println(smallest);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int marks[] = { 10, 20, 30, 40, 50 };
        reverse(marks);

        String str1=new String("Paul");
        System.out.println(str1);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        
    }
}
