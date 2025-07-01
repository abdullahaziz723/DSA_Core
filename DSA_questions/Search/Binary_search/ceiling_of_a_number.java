package Search.Binary_search;
public class ceiling_of_a_number {
    public static void main(String[] args) {
                int arr []={1, 2, 8, 11, 14, 16, 19};
                int target = 20;
                int ans = ceiling(arr, target);
                System.out.println(ans);
    }
        //ceiling of a number is the smallest element in the array which is greater than or equal to the target
        // Time complexity: O(log n)
    static int ceiling(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        if(target>arr[arr.length-1]){
            return -1; // if target is greater than the last element, no ceiling exists
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; // target found
            }
        }
        return end; // return the index of the floor element
    }
}///start of the array is the ceiling of the number if the target is less than the first element
// if the target is greater than the last element, then there is no ceiling, return -
//end is the floor of the number if the target is greater than the last element
// if the target is less than the first element, then there is no floor, return -

