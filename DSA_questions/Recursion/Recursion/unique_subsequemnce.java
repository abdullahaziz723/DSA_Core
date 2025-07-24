package Recursion;

import java.util.*;

public class unique_subsequemnce {

        public static void  printsubSequence(String str, String newString, int idx ,HashSet<String> uniqueSubsequences) {
       if (idx== str.length()) {

        if(uniqueSubsequences.contains(newString)){
            return;
        }else{
            System.out.println(newString);
                uniqueSubsequences.add(newString);
            return;
        }
            
        }
        
       
       char curr=str.charAt(idx);

       //chose to be 
       printsubSequence(str, newString +curr, idx+1,uniqueSubsequences);

       //not to be 
       printsubSequence(str, newString, idx+1,uniqueSubsequences);
    }

    //time complexity: O(2^n) because for each character, we have two choices: to include it or not.
    //space complexity: O(n) due to the recursion stack and the new string being built
    //This function prints all subsequences of a given string using recursion.
    //It explores all combinations of characters by either including or excluding each character at the current index
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> uniqueSubsequences = new HashSet<>();
        printsubSequence(str, "", 0, uniqueSubsequences);

    }
}

