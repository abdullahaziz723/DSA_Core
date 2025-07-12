public class zero_one_pattern {
    public static void main(String[] args) {
        int n =5;
        //outer loop for rows
        for(int i =1;i<=5;i++){
            for(int j =1;j<=i;j++){
                int sum = i + j;
                // Check if the sum is even or odd
                if(sum%2 == 0) {
                    System.out.print("1 "); // Print 1 for even sum
                } else {
                    System.out.print("0 "); // Print 0 for odd sum
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
