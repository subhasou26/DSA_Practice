
import java.util.*;

public class HeroVsVillains {
    
    // Function to check if heroes can win when starting from villain[k] onwards
    private static boolean canWin(int start, int M, int H, int[] villains) {
        int heroesRemaining = M;
        int heroHealth = H;

        for (int i = start; i < villains.length; i++) {
            if (heroesRemaining == 0) return false; 
            
            if (heroHealth > villains[i]) {
                heroHealth -= villains[i]; 
            } else if (heroHealth == villains[i]) {
                heroesRemaining--; 
                heroHealth = H;
            } else {
                heroesRemaining--;
                heroHealth = H;
                i--;
            }
        }
        return true; 
    }

    // Function to find minimum villains to remove
    public static int minVillainsToRemove(int N, int M, int H, int[] villains) {
        int left = 0, right = N, result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (canWin(mid, M, H, villains)) {
                result = mid; 
                right = mid - 1; 
            } else {
                left = mid + 1;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int M = sc.nextInt(); 
        int H = sc.nextInt(); 
        int[] villains = new int[N];

        for (int i = 0; i < N; i++) {
            villains[i] = sc.nextInt();
        }
        
        System.out.println(minVillainsToRemove(N, M, H, villains));
        sc.close();
    }
}
