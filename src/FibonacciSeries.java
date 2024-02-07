public class FibonacciSeries {
//
//    public static long calculateFibonacci(int n) {
//        if (n == 0 || n == 1) {
//            return n;
//        }
//        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
//    }
//
//    public static void main(String[] args) {
//        int num = 5;
//        long fibonacci = calculateFibonacci(num);
//        System.out.println("Fibonacci of " + num + " is: " + fibonacci);
//    }

    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}