
public class Mountain {
    public static int minChangesToMountain(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return 0;
        }

        int minChanges = Integer.MAX_VALUE;

        for (int base = -100; base <= 100; base++) { // Adjust range as needed
            int[] mountain = new int[n];
            int changes = 0;

            // Construct the ideal mountain
            int mid = n / 2;
            if (n % 2 == 0) {
                int leftMid = mid - 1;
                int rightMid = mid;
                for (int i = leftMid; i >= 0; i--) {
                    mountain[i] = base + (leftMid - i);
                }
                for (int i = rightMid; i < n; i++) {
                    mountain[i] = base + (i - rightMid);
                }
            } else {
                for (int i = mid; i >= 0; i--) {
                    mountain[i] = base + (mid - i);
                }
                for (int i = mid + 1; i < n; i++) {
                    mountain[i] = base + (i - mid);
                }
            }

            // Calculate the number of changes
            for (int i = 0; i < n; i++) {
                if (arr[i] != mountain[i]) {
                    changes++;
                }
            }

            minChanges = Math.min(minChanges, changes);
        }

        return minChanges;
    }
    
    public static void main(String[] args) {
        int[] arr = {3,3,4,4,5,5};
        
        System.out.println("Minimum changes required: " + minChangesToMountain(arr));
    }
}
