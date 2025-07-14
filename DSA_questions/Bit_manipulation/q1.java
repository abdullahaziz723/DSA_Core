package Bit_manipulation;

public class q1 {
 public static void main(String[] args) {
    
    int n =7;
    if((n & (n-1))==0 && n!=0){
        System.out.println("Power of 2");
    }
    else{
        System.out.println("Not a power of 2");
    }
 }   
}
