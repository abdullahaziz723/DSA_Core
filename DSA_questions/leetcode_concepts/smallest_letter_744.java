public class smallest_letter_744 {
 public static void main(String[] args) {
   char[] letters = {'c','f','j'};
       char target = 'a';
       char ans= nextGreatestLetter(letters, target);
       System.out.println(ans); // Output: c
 }  
 static char nextGreatestLetter(char[] letters, char target) {
         
        int start =0;
        int end = letters.length-1;
        while(start<=end){
            //find th middle element
            int mid = start + (end - start) / 2;


            if(target<letters[mid]){
                end = mid - 1; // search in the left half
            } else {
                start = mid + 1; // search in the right half
            } 
        }
        return letters[start %letters.length]; // return the next greatest letter, if not found, return the first letter; 
    }
 

}


