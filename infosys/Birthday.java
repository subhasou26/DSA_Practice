import java.util.Scanner;

public class Birthday {
    static final int MOD = 10000;

    public static int countValidArrays(int n, int k) {
        int[][] dp = new int[k + 1][n + 1];

        // Base case: Sequences of length 1
        for (int j = 1; j <= n; j++) {
            dp[1][j] = 1;
        }

        // Fill the DP table
        for (int i = 2; i <= k; i++) {
            for (int j = 1; j <= n; j++) {
                // Sum all dp[i-1][x] where x is a divisor of j
                for (int x = 1; x <= j; x++) {
                    if (j % x == 0) {
                        dp[i][j] = (dp[i][j] + dp[i - 1][x]) % MOD;
                    }
                }
            }
        }

        // Compute the final result
        int result = 0;
        for (int j = 1; j <= n; j++) {
            result = (result + dp[k][j]) % MOD;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        System.out.println(countValidArrays(n, k));
    }
}
