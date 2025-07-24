package Recursion;

public class recursion3 {
    public static void main(String[] args) {
    int  ans=   calfactorail(5 );
    System.out.println(ans);

    }
    public static int calfactorail (int n ){
        if(n==1||n==0){
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        
        return  n*calfactorail(n-1);


    }
}
