package Sorting;

public class Bubble_sort {

    public static void main(String[] args) {
        // Example array to be sorted
    int arr []= {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }


}
    //time complexity is O(n^2) and space complexity is O(1)    
static void bubbleSort(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                // swap arr[j] and arr[j+1]
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
}