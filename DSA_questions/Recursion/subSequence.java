package Recursion;

public class subSequence {

    public static void  printsubSequence(String str, String newString, int idx) {
       if (idx== str.length()) {
            System.out.println(newString);
            return;
        }
        
       
       char curr=str.charAt(idx);

       //chose to be 
       printsubSequence(str, newString +curr, idx+1);

       //not to be 
       printsubSequence(str, newString, idx+1);
    }

    //time complexity: O(2^n) because for each character, we have two choices: to include it or not.
    //space complexity: O(n) due to the recursion stack and the new string being built
    //This function prints all subsequences of a given string using recursion.
    //It explores all combinations of characters by either including or excluding each character at the current index
    public static void main(String[] args) {
        String str = "abc";
        printsubSequence(str, "", 0);

    }
}
