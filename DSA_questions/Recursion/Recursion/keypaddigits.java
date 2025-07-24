package Recursion;

public class keypaddigits {
    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printcomb(String str, int idx, String comb) {


        if (idx == str.length()) {
            System.out.println(comb);
            return;
        }
        char currentChar = str.charAt(idx);
        String mapping = keypad[currentChar - '0']; // Get the corresponding string for the digit

        for (int i = 0; i < mapping.length(); i++) {
            printcomb(str, idx+1, comb + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
            String str = "4"; // Example input
            printcomb(str, 0, "");
    }
}
