public class removereducancystring {

        public static void main(String[] args) {
            String input = "aaabbbccc";
            StringBuilder result = new StringBuilder();
            for (char c : input.toCharArray()) {
                if (result.indexOf(String.valueOf(c)) == -1) {
                    result.append(c);
                }
            }
            System.out.println(result.toString());
        }
    }


