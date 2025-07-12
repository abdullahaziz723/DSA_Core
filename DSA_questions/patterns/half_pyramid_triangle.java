public class half_pyramid_triangle {
   public static void main(String[] args) {
    for(int i=1; i<=4; i++) {
        // Inner loop for columns
        for(int j=1; j<=i; j++) {
            System.out.print("* ");
        }
        // Outer loop for rows
        System.out.println();
   } 
}
}
