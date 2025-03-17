import java.util.*;

public class Lexico {
    public static int[] minLexicographicalArray(int[] A, int K) {
        int N = A.length;
        
        for (int i = 0; i < N; i++) {
            int minIndex = i;
            
            // Check the next K elements for a possible swap
            for (int j = i + 1; j < N && j <= i + K; j++) {
                if (A[j] < A[minIndex]) {
                    minIndex = j; // Update to smallest found element
                }
            }

            // If a smaller element is found within the range, swap and break
            if (minIndex != i) {
                int temp = A[i];
                A[i] = A[minIndex];
                A[minIndex] = temp;
                break;
            }
        }
        
        return A;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] A = new int[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        
        int K = sc.nextInt();
        
        int[] result = minLexicographicalArray(A, K);
        
        for (int num : result) {
            System.out.println(num);
        }
        
        sc.close();
    }
}
