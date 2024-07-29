public class Digitreverse {
    //if the reverse causes the value to go outside the signed 32 bit range then return 0
    //else return the reversed number.
    // also return the 0 in negative number
    public static void main(String[] args) {
        int input = 123;
        int output = reverse(input);
        System.out.println(output);  // Output: 321

        input = -123;
        output = reverse(input);
        System.out.println(output);  // Output: 0

        input = 1534236469;
        output = reverse(input);
        System.out.println(output);  // Output: 0 (due to overflow)
    }

    public static int reverse(int x) {
        if (x < 0) {
            return 0;
        }

        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Check for overflow/underflow before actually performing the multiplication and addition
            if (reversed > (Integer.MAX_VALUE - digit) / 10) {
                return 0;
            }

            reversed = reversed * 10 + digit;
        }
        return reversed;
    }
}
