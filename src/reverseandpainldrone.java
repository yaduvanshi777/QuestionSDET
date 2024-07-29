public class reverseandpainldrone {



        public static String reverse(String str) {
            StringBuilder result = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                result.append(str.charAt(i));
                //result += str.charAt(i);
            }
            return result.toString();
        }
        public static boolean isPalindrome(String str)
        {
            // Initializing an empty string to store the reverse
            // of the original str
            String rev = reverse(str);

            // Initializing a new boolean variable for the
            // answer
            boolean ans = false;


            // Checking if both the strings are equal
            if (str.equals(rev)) {
                ans = true;
            }
            return ans;

        }

        //Hello vivek fine i
        public static void main(String[] args) {
            String str = "I love my friend";
            str= str.toLowerCase();
            System.out.println(reverse(str));
            System.out.println(isPalindrome(str));
        }
    }


