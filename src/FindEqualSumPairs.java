import java.util.HashMap;
import java.util.Map;

public class FindEqualSumPairs {
    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 1, 2, 9, 8};
        findEqualSumPairs(arr);
    }

    public static void findEqualSumPairs(int[] arr) {
        // Map to store the sum of pairs and the corresponding pair of elements as a string
        Map<Integer, String> map = new HashMap<>();

        // Traverse each pair in the array
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];

                // If sum already exists in the map, we've found another pair with the same sum
                if (map.containsKey(sum)) {
                    String firstPair = map.get(sum);
                    System.out.println("Pair 1: " + firstPair);
                    System.out.println("Pair 2: (" + arr[i] + ", " + arr[j] + ")");
                    return;
                } else {
                    // Otherwise, add the sum and the pair as a string to the map
                    map.put(sum, "(" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }

        System.out.println("No pairs found with equal sum.");
    }
}
