package Bit_manipulation;
public class Bit_manipulation {
    public static void main(String[] args) {
        
        int n = 5; // Example number
        int bitPosition = 2; // Example bit position to check
        int bitmask=1<<bitPosition; // Create a bitmask for the given position  
        // Check if the bit at the given position is set
        // if ((n & (1 << bitPosition)) == 0) {
        //     System.out.println("Bit was zero");
        // } else {
        //     System.out.println("Bit was one");
        // }

        // Set the bit at the given position
        int newNumber = n | bitmask; // Set the bit at the given position
        System.out.println(newNumber); // Print the new number with the bit set





        // Clear the bit at the given position

        int notbitmask=~(bitmask);
        int clearedNumber = n & notbitmask; // Clear the bit at the given position
        System.out.println(clearedNumber); // Print the new number with the bit cleared




    }
}
