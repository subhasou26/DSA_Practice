import java.util.Scanner;

public class RemoveSqre {
    static boolean isPerfectSquare(int x) {
        if (x >= 0) {

            // Find floating point value of
            // square root of x.
            int sr = (int) Math.sqrt(x);

            // if product of square root
            // is equal, then
            // return T/F

            return ((sr * sr) == x);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        int temp[] = new int[10000];
        int j = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
                if (isPerfectSquare(i)) {
                    count--;
                    temp[j] = i;
                    j++;
                } else {
                    for (int k = 0; k < j; k++) {
                        if (i > temp[k] && j != 0) {
                            if (i % temp[k] == 0) {
                                count--;
                                k = j + 1;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }

        }
        System.out.println(count);
        sc.close();
    }
}
