public class lucky_number_1394 {
public static void main(String[] args) {
    int[] arr = {2, 2, 3, 4};
    // Example input: arr = [2, 2, 3, 4]

    System.out.println(findLucky(arr)); // Output: 2
    // Explanation: The lucky number is 2 because it appears exactly 2 times in the array.
}
    
// LeetCode Problem: 1394. Find Lucky Integer in an Array

    static int findLucky(int[] arr) {
     int[] freq = new int[501];
    for (int num : arr) {
        freq[num]++;
    }
    for (int i = 500; i >= 1; i--) {
        if (freq[i] == i) {
            return i;
        }
    }

    return -1;   
    }
}