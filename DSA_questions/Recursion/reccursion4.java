package Recursion;

public class reccursion4 {
    public static void main(String[] args) {
       int a = 0, b = 1, n = 7; // Example input
         System.out.println(a);
         System.out.println(b);
         fib( a, b, n-2);

    }

    static void fib(int a,int b,int n){
         if(n==0){
            return;
         }
        
        int c =a+b;
         System.out.println(c);
         fib(b,c,n-1);

    }
    
}
