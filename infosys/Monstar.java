import java.util.*;

public class Monstar {
    static class Monster {
        int power, bonus;

        Monster(int power, int bonus) {
            this.power = power;
            this.bonus = bonus;
        }
    }

    public static int maxDefeatedMonsters(int n, int e, Monster[] monsters) {
        // Sort monsters by their power requirement (ascending order)
        Arrays.sort(monsters, Comparator.comparingInt(m -> m.power));

        int count = 0;
        for (Monster m : monsters) {
            if (e >= m.power) {  // If we have enough experience to fight
                e += m.bonus;    // Gain experience
                count++;         // Increase count of defeated monsters
            } else {
                break; // If we can't defeat this monster, stop
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(); // Number of monsters
        int e = scanner.nextInt(); // Initial experience

        Monster[] monsters = new Monster[n];

        // Read monsters' power values
        for (int i = 0; i < n; i++) {
            int power = scanner.nextInt();
            monsters[i] = new Monster(power, 0);
        }

        // Read monsters' bonus values
        for (int i = 0; i < n; i++) {
            monsters[i].bonus = scanner.nextInt();
        }

        System.out.println(maxDefeatedMonsters(n, e, monsters));

        scanner.close();
    }
}
