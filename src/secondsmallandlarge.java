import java.util.Arrays;
public class secondsmallandlarge {

        public static int findSecondLargest(int[] arr) {
            Arrays.sort(arr);
            return arr[arr.length - 2];
        }

        public static int findSecondSmallest(int[] arr) {
            Arrays.sort(arr);
            return arr[1];
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println("Second Largest: " + findSecondLargest(arr)); // Output: 4
            System.out.println("Second Smallest: " + findSecondSmallest(arr)); // Output: 2
        }
    }
