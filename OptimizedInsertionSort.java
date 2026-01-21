public class OptimizedInsertionSort {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i;

            // Shift elements instead of swapping
            while (j > 0 && arr[j - 1] > key) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 4, 5, 2, 9, 1};

        insertionSort(arr);

        System.out.print("Sorted Array: ");
        for (int x : arr)
            System.out.print(x + " ");
    }
}
