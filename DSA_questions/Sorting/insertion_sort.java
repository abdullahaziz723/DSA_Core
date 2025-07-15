package Sorting;

public class insertion_sort {
    public static void main(String[] args) {
        // Example array to be sorted
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
    // Time complexity is O(n^2) and space complexity is O(1)
    static void insertionSort(int arr[]) {
        int n = arr.length;   
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    
}
