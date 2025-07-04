public class infinite_array {
    public static void main(String[] args) {

       int arr [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
       int target = 10;
       System.out.println(range(arr, target));

    }


    static int range(int arr[], int target) {
        // Finding the range of the target
        int start = 0;

        int end = 1;

        // Increase the range exponentially until we find a range that contains the target
        while (target > arr[end]) {
                  int temp = end + 1; // Store the next end index
            end = end+(end -start+1) * 2; // Double the end index
             start = temp; 
        }

        // Now perform binary search in the found range
        return binarysearch(arr, target, start, end);
    }

    static int binarysearch(int [ ]arr,int target ,int start ,int end){
        while(start<=end ){
            int mid = start +(end -start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
        }
            else{
                return mid;
            }
        }
        return -1; // Target not found
    }
}
