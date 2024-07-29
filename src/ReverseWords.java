public class ReverseWords {
    public static String reverseWords(String input) {
        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            StringBuilder reversedWord = new StringBuilder(words[i]);
            reversed.append(reversedWord.reverse()).append(" ");
        }

        return reversed.toString().trim();
    }

    public static void main(String[] args) {
        String input = "I Am Not String";
        String output = reverseWords(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}
