import java.util.*;

public class Intresting {
    public static int maxPieces(String s) {
        int[] freq = new int[26];  // Stores frequency of each letter
        
        // Count character frequencies
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        
        // Collect non-zero frequencies
        List<Integer> counts = new ArrayList<>();
        for (int f : freq) {
            if (f > 0) counts.add(f);
        }
        
        // Compute the GCD of all character frequencies
        int gcdValue = counts.get(0);
        for (int i = 1; i < counts.size(); i++) {
            gcdValue = gcd(gcdValue, counts.get(i));
        }
        
        return gcdValue;
    }
    
    // Function to compute GCD using Euclidean algorithm
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(maxPieces(s));
        sc.close();
    }
}
