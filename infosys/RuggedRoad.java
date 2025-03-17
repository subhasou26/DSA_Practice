
import java.util.*;

public class RuggedRoad {
    
    // Function to calculate minimum days needed
    public static int minDaysToSlope(int N, int[] L) {
        int totalDays = 0;
        
        // Iterate through terrain segments
        for (int i = N - 1; i > 0; i--) {
            if (L[i] >= L[i - 1]) {  // If terrain is not strictly decreasing
                int requiredReduction = L[i] - L[i - 1] + 1;
                int days = minDaysRequired(requiredReduction);
                totalDays = Math.max(totalDays, days);
                L[i] -= (1 << (days - 1)); // Apply max possible dig
            }
        }
        
        return totalDays;
    }
    
    // Binary search to find minimum days needed
    private static int minDaysRequired(int requiredReduction) {
        int left = 1, right = 30; // 2^30 is much larger than 10^5
        while (left < right) {
            int mid = (left + right) / 2;
            if ((1 << (mid - 1)) >= requiredReduction)
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] L = new int[N];
        
        for (int i = 0; i < N; i++) {
            L[i] = sc.nextInt();
        }
        
        System.out.println(minDaysToSlope(N, L));
        sc.close();
    }
}
