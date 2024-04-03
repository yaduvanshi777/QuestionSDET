public class ReversewordsString {
    public static void main(String[] args) {


            String[] s = "Doge have 812 Horse power".split(" ");
            StringBuilder ans = new StringBuilder();
            for (int i = s.length - 1; i >= 0; i--) {
                ans.append(s[i]).append(" ");
            }

            System.out.println(
                    ans.substring(0, ans.length() - 1));

    }
}
