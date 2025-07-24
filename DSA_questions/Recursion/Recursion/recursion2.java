package Recursion;

public class recursion2 {
    public static void print(int n,int i ,int sum) {
      if(i==n){
        sum+=i;
        System.out.println(sum);
        return;// This will print the sum of numbers from 1 to n
      }
        sum+=i;
       print(n, i+1, sum);
    }
    public static void main(String[] args) {
        print(5, 1, 0);
    }
    
}
