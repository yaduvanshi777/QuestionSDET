
import java.util.HashMap;
import java.util.Map;



    public class MostRepetitiveConsonant {
        public static void main(String[] args) {
            String s = "Vvivek Kumar";

            // Convert string to lowercase
            s = s.toLowerCase();

            // Define consonants
            String consonants = "bcdfghjklmnpqrstvwxyz";

            // Create a map to count frequency of consonants
            Map<Character, Integer> consonantCount = new HashMap<>();

            // Filter out consonants from the string and count their frequency
            for (char c : s.toCharArray()) {
                if (consonants.indexOf(c) != -1) {
                    consonantCount.put(c, consonantCount.getOrDefault(c, 0) + 1);
                }
            }

            // Find the most repetitive consonant
            char mostRepetitiveConsonant = '\0';
            int maxCount = 0;

            for (Map.Entry<Character, Integer> entry : consonantCount.entrySet()) {
                if (entry.getValue() > maxCount) {
                    mostRepetitiveConsonant = entry.getKey();
                    maxCount = entry.getValue();
                }
            }

            if (mostRepetitiveConsonant != '\0') {
                System.out.println("The most repetitive consonant is: '" + mostRepetitiveConsonant + "'"+maxCount);
            } else {
                System.out.println("There are no consonants in the string.");
            }
        }
    }


