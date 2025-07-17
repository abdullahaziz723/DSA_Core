package Recursion;

public class tower_of_hanoi {

    public static void towerOfHanoi(int n ,String src,String helper,String dest){
        if(n==1){
            System.out.println("transfer disk "+n+" from " +src +" to "+ dest);
            return ; // Corrected typo from 'rerturn' to 'return'
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk "+n+" from " +src +" to "+ dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        //time complexity is O(2^n)
        //space complexity is O(n)
        int n =3;
        towerOfHanoi(n, "S", "H", "D");

    }

    //explanation:
    //1. transfer n-1 disks from source to helper using destination as helper
    //2. transfer nth disk from source to destination
    //3. transfer n-1 disks from helper to destination using source as helper
    //this is the recursive approach to solve tower of hanoi problem
    //base case is when n==1, we can directly transfer the disk from source to
    //destination without using helper
    //the recursive case is to first transfer n-1 disks to helper, then transfer the
    //nth disk to destination, and finally transfer the n-1 disks from helper to destination
    //this way we can solve the problem in O(2^n) time complexity and
    //O(n) space complexity due to the recursive stack
    //the number of moves required to solve the problem is 2^n - 1
    //the number of disks is n, and the number of moves is exponential in n
    //this is a classic problem in recursion and is often used to teach the concept of recursion
    //the problem can also be solved using iterative approach, but the recursive approach is more elegant and easier to understand
    //the problem can also be solved using dynamic programming, but the recursive approach is more intuitive
    //the problem can also be solved using backtracking, but the recursive approach is more straightforward
    //the problem can also be solved using memoization, but the recursive approach is more efficient
    //the problem can also be solved using tabulation, but the recursive approach is more concise
    //the problem can also be solved using divide and conquer, but the recursive approach is more
    //the problem can also be solved using greedy approach, but the recursive approach is more optimal
    //the problem can also be solved using brute force, but the recursive approach is more elegant
}