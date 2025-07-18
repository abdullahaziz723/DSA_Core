package Recursion;

public class recursion6 {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurence(String str, int idx, char element) {
       if(idx==str.length()){
        System.out.println(first);
        System.out.println(last);
        return;
       }
       
        char curr = str.charAt(idx);
        if (curr == element) {
            if (first == -1) {
                first = idx;

            } else {
                last = idx;
            }
        }
        findOccurence(str, idx+1, element);

    }
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // This function finds the first and last occurrence of a character in a string.
    // It uses recursion to traverse the string and updates the first and last indices accordingly.
    // If the character is found, it updates the first occurrence if it hasn't been set yet,
    // and updates the last occurrence every time it finds the character.
    // If the character is not found, it will print -1 for both first and last occurrences.
    // If the string is empty, it will also print -1 for both occurrences.
    // Example: For the string "aaabcerfdaad" and character 'a', it will print:
    // 0
    // 10

    public static void main(String[] args) {
        String str = "aaabcerfdaad"; 
        findOccurence(str,0,'a' );
    }
}
