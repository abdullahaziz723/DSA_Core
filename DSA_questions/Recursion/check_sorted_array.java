package Recursion;

public class check_sorted_array {

    public static boolean isSorted(int []arr,int idx){
            if(idx==arr.length-1){
            return true;
            }
        if(arr[idx]>=arr[idx+1]){
            //array is unsorted till now
          return false ;
        }
            return isSorted(arr, idx+1);
        // This function checks if the array is sorted in non-decreasing order.
        // It uses recursion to compare each element with the next one.
        //time complexity: O(n)
        //space complexity: O(n) due to recursion stack
    }
    public static void main(String[] args) {
            int arr[]={1, 2, 3, 4,4 };   
            
            System.out.println( isSorted(arr, 0));
            // Output: true
    }
    
}
