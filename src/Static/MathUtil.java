package Static;

public class MathUtil {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int factorialResult = MathUtil.factorial(5);
        System.out.println("Factorial of 5: " + factorialResult);
    }
}

