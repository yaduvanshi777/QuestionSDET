public class ReverseStringWithoutSpecialChars {

    public static void main(String[] args) {
        String input = "a,b$cvivek";
        String output = reverseString(input);
        System.out.println(output);  // Output: "c,b$a"
    }

    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            if (!Character.isLetterOrDigit(chars[left])) {
                left++;
            } else if (!Character.isLetterOrDigit(chars[right])) {
                right--;
            } else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }
}

/*
Convert String to Character Array: char[] chars = str.toCharArray();
Initialize Pointers: int left = 0, right = chars.length - 1;
Loop Until Pointers Meet: while (left < right)
Increment left if the character at left is not alphanumeric.
Decrement right if the character at right is not alphanumeric.
Swap the characters if both are alphanumeric, then move both pointers.
Return Result: Convert the character array back to a string and return it.

 */