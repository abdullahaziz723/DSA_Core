package Basic_ques;

public class practice {
    public static void main(String[] args) {
        int num = 153;
    //    checkarmStrong(num);
       System.out.println(checkarmStrong(num));

    }

    static boolean checkarmStrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;

        }
        return sum == original;

    }

}
