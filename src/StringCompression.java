public class StringCompression {

    public static String compressString(String input) {
        // Initialize a StringBuilder to build the compressed string
        StringBuilder compressed = new StringBuilder();

        // Get the length of the input string
        int length = input.length();

        // Initialize a counter for character repetitions
        int count = 1;

        // Iterate through the string
        for (int i = 0; i < length; i++) {
            // Check if the current character is the same as the next character
            if (i + 1 < length && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                // Append the current character and its count to the StringBuilder
                compressed.append(input.charAt(i)).append(count);
                // Reset the count to 1 for the next character
                count = 1;
            }
        }

        // Return the compressed string
        return compressed.toString();
    }

    public static void main(String[] args) {
        String input = "aabbcdaav";
        String compressedOutput = compressString(input);
        System.out.println(compressedOutput); // Output: a2b2c1d1a2v1
    }
}
