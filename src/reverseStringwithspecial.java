public class reverseStringwithspecial {

    public static void main(String[] args) {
        //String str = "I L0^3 D#lH!verY";
        String str = "hello wor,ld";
        System.out.println(reverse(str));

    }
        public static String reverse(String str){


            String[] words = str.split(" ");
            StringBuilder reversed = new StringBuilder();
            for (int i = words.length - 1; i >= 0; i--) {
                reversed.append(words[i]).append(" ");
            }
            return reversed.toString().trim();

        }

}
