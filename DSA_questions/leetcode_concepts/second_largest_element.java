public class second_largest_element {
 public static void main(String[] args) {
    int arr [] = {12, 35, 1, 10, 34, 1};
    System.out.println("Second largest element is: " + secmax(arr));
    // Output: Second largest element is: 34
 }  
 
 
 static int secmax(int arr[]){
    int max = Integer.MIN_VALUE;
    int secmax = Integer.MIN_VALUE;
    
    for(int i = 0; i < arr.length; i++){
        if(arr[i] > max){
            secmax = max;
            max = arr[i];
        } else if(arr[i] > secmax && arr[i] != max){
            secmax = arr[i];
        }
    }
    
    return secmax;
 }

}
