import java.util.*;

public class ChoseDish {
    public static int getBestDishType(int[] A, int N) {
        Map<Integer, List<Integer>> dishPositions = new HashMap<>();

        // Store positions of each dish type
        for (int i = 0; i < N; i++) {
            dishPositions.putIfAbsent(A[i], new ArrayList<>());
            dishPositions.get(A[i]).add(i);
        }

        int bestType = Integer.MAX_VALUE;
        int maxCount = 0;

        // Iterate through each unique dish type
        for (Map.Entry<Integer, List<Integer>> entry : dishPositions.entrySet()) {
            int type = entry.getKey();
            List<Integer> positions = entry.getValue();
            int count = 0, lastPicked = -2;

            // Count non-adjacent selections
            for (int pos : positions) {
                if (pos > lastPicked + 1) {
                    count++;
                    lastPicked = pos;
                }
            }

            // Update bestType based on count and smallest numeric value
            if (count > maxCount || (count == maxCount && type < bestType)) {
                maxCount = count;
                bestType = type;
            }
        }

        return bestType;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        while (T-- > 0) {
            int N = scanner.nextInt(); // Number of dishes
            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }

            System.out.println(getBestDishType(A, N));
        }

        scanner.close();
    }
}
