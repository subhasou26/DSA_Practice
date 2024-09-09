public class array_sort {
    public static boolean isSort(int arr[], int i) {

        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSort(arr, i + 1);

    }

    public static void main(String[] args) {
            int arr[]={1,2,1,4,5,6};
            System.out.println(isSort(arr, 0));
    }
}
