import java.util.*;

public class MaxDishes {
    public static int maxDishesEaten(int[] arr) {
        // Count unique dish types
        Set<Integer> uniqueDishes = new HashSet<>();
        for (int dish : arr) {
            uniqueDishes.add(dish);
        }

        // Convert unique dishes into a sorted list
        List<Integer> sortedDishes = new ArrayList<>(uniqueDishes);
        Collections.sort(sortedDishes);

        int maxDishes = 0;
        int A = 1; // Start with 1 dish

        for (int dish : sortedDishes) {
            if (A > maxDishes) break; // If A exceeds available dishes, stop
            maxDishes += A;
            A *= 2; // Next order should be double
        }

        return maxDishes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] Arr = new int[N];

        for (int i = 0; i < N; i++) {
            Arr[i] = sc.nextInt();
        }

        System.out.println(maxDishesEaten(Arr));
        sc.close();
    }
}
