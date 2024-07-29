import java.util.Arrays;
public class MaxandMin {



        public static int findMax(int[] arr) {
            return Arrays.stream(arr).max().orElseThrow();
        }

        public static int findMin(int[] arr) {
            return Arrays.stream(arr).min().orElseThrow();
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println("Max: " + findMax(arr)); // Output: 5
            System.out.println("Min: " + findMin(arr)); // Output: 1
        }
    }


