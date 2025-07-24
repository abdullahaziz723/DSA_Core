package Recursion;

public class recursion1 {

    static void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        print(n - 1);
    }
    public static void main(String[] args) {
        int n = 5; // Example input
        print(n);
        // This will print numbers from n to 1
        // Output: 5 4 3 2 1

    }
}
