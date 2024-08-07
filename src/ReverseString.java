public class ReverseString {

    public static String reverse(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
            //result += str.charAt(i);
        }
        return result.toString();
    }

//Hello vivek fine i
    public static void main(String[] args) {
        System.out.println(reverse("String vivek"));
    }
}
