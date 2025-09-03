import java.util.*;

public class Stone {
    public static void solve(Scanner sc) {
        int T = sc.nextInt();  // number of test cases

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            int minDiff = Integer.MAX_VALUE;

            // Try all 4 combinations of (AlexSide, BobSide)
            char[] sides = {'S', 'E'};
            for (char alexSide : sides) {
                for (char bobSide : sides) {
                    int l = 0, r = N - 1;
                    long alexSum = 0, bobSum = 0;
                    boolean alexTurn = true;

                    while (l <= r) {
                        if (alexTurn) {
                            if (alexSide == 'S') {
                                alexSum += A[l++];
                            } else {
                                alexSum += A[r--];
                            }
                        } else {
                            if (bobSide == 'S') {
                                bobSum += A[l++];
                            } else {
                                bobSum += A[r--];
                            }
                        }
                        alexTurn = !alexTurn;
                    }

                    minDiff = (int)Math.min(minDiff, Math.abs(alexSum - bobSum));
                }
            }

            System.out.println(minDiff);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
}
