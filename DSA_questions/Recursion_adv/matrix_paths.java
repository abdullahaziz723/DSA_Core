package Recursion_adv;

public class matrix_paths {

    public static int countPaths(int i,int j , int m,int n) {
        // Base case: if we reach the last cell, there's only one way to stay there
        if (i==n||j==m) {
            return 0; // If we go out of bounds, return 0 paths
        }

        if (i==n-1&&j==m-1) {
            return 1;
        }
        //move downwards
        int downPaths= countPaths(i+1, j, m, n);

        // move right
        int rightPaths = countPaths(i, j+1, m, n);

        return downPaths + rightPaths;


    }
    public static void main(String[] args) {
        int n = 3, m = 3; // Example input for a 3x3 matrix
        int totalpaths= countPaths(0, 0, m, n);
        System.out.println(totalpaths);
    }
}

