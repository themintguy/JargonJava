public class Insertion {
    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 4, 3};

        insertionSort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            // Move elements greater than current to one position ahead
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place the current element at its correct position
            arr[j + 1] = current;
        }
    }
}
