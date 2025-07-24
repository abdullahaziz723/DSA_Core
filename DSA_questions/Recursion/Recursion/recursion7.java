package Recursion;
public class recursion7 {

    
    public static void moveAllx(String str ,int idx,int count ,String newString){
        if(idx == str.length()){
            for(int i = 0; i < count; i++){
                newString += 'x';  // Append 'x' count times
            }
            System.out.println(newString);
            return;
        }


        char currentChar = str.charAt(idx);
        if(currentChar=='x'){
            count++;
            moveAllx(str, idx+1, count, newString);
        } else {
            newString += currentChar;   //new String =  newString + currentChar
            moveAllx(str, idx+1, count, newString);

        }
    }
    
    public static void main(String[] args) {
       String str = "axbcxxd";
        moveAllx(str, 0, 0, "");

        // System.out.println(moveAllx(str, 0, 0, str);)
        // Output: true
    }
}
