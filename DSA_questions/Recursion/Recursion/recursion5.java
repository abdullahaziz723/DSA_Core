package Recursion;
public class recursion5 {
 public static void main(String[] args) {
    int x =2,n=5;
    int ans =calpower(x, n);
    System.out.println(ans);

 }  
 
 
  public static int calpower( int x,int n){
   if(n==0){
    return 1 ;
   }
   if(x==0)
   return 0;

   
    // int xpownm1=calpower(x, n-1) ;
    // int xpow=x*xpownm1;
    // return xpow;

    //for logn height recursion
    if(n%2==0){
       return  calpower(x, n/2)*calpower(x, n/2);    
    }else{
       return x*calpower(x, n/2)*calpower(x, n/2);
}
  }
}