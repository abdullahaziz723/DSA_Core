public class hollow_square {
    public static void main(String[] args) {
        int n =4;
        int m =5;
        for(int i =1;i<=n;i++){
            //inner loop for columns
            for(int j=1;j<=m;j++){
                //CELL ->(i,j)
                if(i==1||i==n || j==1 || j==m){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            //outer loop for rows
            System.out.println();
        }
    }
}
