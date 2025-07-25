package Recursion_adv;

public class permutaion_of_strings {

    public static void  printPermutations(String str, String Permutations) {
        if(str.length() == 0) {
            System.out.println(Permutations);
            return;
        }

     for(int i =0;i<str.length();i++){
        char currentChar = str.charAt(i);
       //"abc"-> "ab"
       String newString =str.substring(0,i)+str.substring(i+1);
       printPermutations(newString, Permutations+currentChar);


     }
    }
    public static void main(String[] args) {
        String str = "abc"; // Example input
        printPermutations(str, "");
        // Output: abc, acb, bac, bca, cab, cba   
    }
}
