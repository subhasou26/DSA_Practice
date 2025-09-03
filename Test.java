import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
   

    public static String test(String str) {
        Set<Character> s = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            s.add(str.charAt(i));
            if (s.size() == 10) {
                return "True";
            }
        }
        return "False";
    }

    public static boolean palindrome(String str) {
        String newStr = str.toLowerCase().replaceAll("[^a-z]", "");
        StringBuilder sb = new StringBuilder(newStr);
        sb.reverse();
        if (newStr.equals(sb.toString())) {
            return true;
        }
        return false;
    }
 static List<Integer> result = new ArrayList<>();
    public static boolean f(int nums[], int ind, int target, List<Integer> list) {
        if (target == 0) {
            result = new ArrayList<>(list);
            return true;
        }
        if (ind < 0)
            return false;

        if (target >= nums[ind]) {
            list.add(nums[ind]);
            if (f(nums, ind - 1, target - nums[ind], list))
                return true;
            list.remove(list.size() - 1);
        }
        if (f(nums, ind - 1, target, list))
            return true;
        return false;
        
    }

    public static void main(String[] args) {
        // String str = "abcdefghij";
        // System.out.println(test(str)); // Output: True

        // str = "abaaaa";
        // System.out.println(test(str)); // Output: False
        // System.out.println(palindrome("Was it a car or a cat I saw?"));
        int arr[] = new int[] { 1, 2, 4, 3 };
        int sum = Arrays.stream(arr).sum();
        if (sum % 2 != 0)
            System.out.println("not possible");
        int target = sum / 2;
        System.out.println(target);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(f(arr, arr.length - 1, target, list));
        // System.out.println(list);
        System.out.println(result);
    }
}