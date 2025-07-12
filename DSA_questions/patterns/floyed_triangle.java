public class floyed_triangle {
    public static void main(String[] args) {
        int n=5;
        int num=1; // Starting number
        // Outer loop for rows
        for(int i = 1; i <= 5; i++) {
            // Inner loop for columns
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++; // Increment the number for the next position
            }
            // Outer loop for rows
            System.out.println();
        }
    }
}
