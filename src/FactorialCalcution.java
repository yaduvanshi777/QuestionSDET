public class FactorialCalcution {
    public static void main(String[] args) {
        int num = 5;
        long factorial = calculateFactorial(num);
        System.out.println("Factorial of " + num + " is: " + factorial);
    }

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
}