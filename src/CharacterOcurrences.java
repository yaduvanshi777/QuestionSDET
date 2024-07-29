public class CharacterOcurrences {
    // Code to find occurrences of each character in a given string

// Input: vivek

// Output: //v>2 i>1 e>1 k>1

    public static void main(String[] args) {
        String str = "vivek";
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] > 0) {
                System.out.print(str.charAt(i) + ">" + count[str.charAt(i)]+" ");
                count[str.charAt(i)] = 0;
            }
        }
    }



}
