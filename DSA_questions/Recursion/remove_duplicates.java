package Recursion;

public class remove_duplicates {
    public static boolean []map = new boolean[26];


    public static void removeDublicates(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currentChar = str.charAt(idx);
        if (map[currentChar - 'a']) {
            // Character already seen, skip it
            removeDublicates(str, idx+1, newString);
        } else {
            // Mark character as seen and include it in the new string
            newString+= currentChar;
            map[currentChar - 'a'] = true;
            removeDublicates(str, idx+1, newString);
        }
    }
    // time complexity: O(n)
    // space complexity: O(n) due to recursion stack and boolean array  
    
    public static void main(String[] args) {
        String str = "aabccdeef";
        removeDublicates(str, 0, "");

    }   
}
