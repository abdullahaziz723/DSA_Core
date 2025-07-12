public class number_pattern {
 public static void main(String[] args) {
    int n = 5; // Number of rows
    //outer loop for rows
    for(int i=1;i<=n;i++){
        for(int j =1;j<=n-i+1;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }

 }   
}
