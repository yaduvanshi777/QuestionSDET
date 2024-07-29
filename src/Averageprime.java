public class Averageprime {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 10; i++) {
            if (isPrime(i)) {
                sum = sum + i;
                count++;
            }
        }
        System.out.println(sum / count);
        System.out.println(sum);
        System.out.println(count);
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
