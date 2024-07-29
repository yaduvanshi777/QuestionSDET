//public class WordOccurences {
//    public static void main(String[] args) {
//        String str = "I am Java developer I am proud of it";
//        String[] words = str.split(" ");
//        int[] count = new int[words.length];
//
//        for (int i = 0; i < words.length; i++) {
//            for (int j = i; j < words.length; j++) {
//                if (words[i].equals(words[j])) {
//                    count[i]++;
//                }
//            }
//        }
//
//        for (int i = 0; i < words.length; i++) {
//            System.out.print(words[i] + ">" + count[i] + " ");
//        }
//    }
//
//}
import java.util.HashMap;
import java.util.Map;

public class WordOccurrences {
    public static void main(String[] args) {
        String str = "I am Java developer I am proud of it";
        String[] words = str.split(" ");
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.print(entry.getKey() + ">" + entry.getValue() + " ");
        }
    }
}