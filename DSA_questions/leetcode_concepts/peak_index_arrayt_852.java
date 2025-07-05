public class peak_index_arrayt_852 {
    public static void main(String[] args) {
        int [] arr = {0,1,2,3,4,3,2,1,0};

        System.out.println(peakIndexInMountainArray(arr)); // Output: 1
        // Explanation: The peak index is 1 because arr[1] = 1 is the highest value in the array.
    }
    // LeetCode Problem: 852. Peak Index in a Mountain Array
    // A mountain array is defined as an array that has a peak element, which is greater    
    static int peakIndexInMountainArray(int[] arr) {
        int start =0;

        int end = arr.length-1;
        while(start<end){
            int mid =start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                // we are in the decreasing part of the array
                end = mid; // we can be at the peak or left of it

        }
        else{
            //you are in the increasing part of the array
            start = mid+1; // we can be at the peak or right of it
            //because we know mid is +1>element that mid element
        }
    }
    //int the end start == end and pointing to the largest number because of the  2 checks above
    ////start and end are always pointing to the peak element
    /// hence wehn we return start or end, we will get the peak index
     return start;
    }
}

