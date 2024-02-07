public class LargerstElementArr {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    static class LargerstElement {


        public static void main(String[] args) {
            int[] arr = new int[]{1, 2, 3, 7, 5};
            int max = largestElement(arr);
            System.out.println(max);
        }

        public static int largestElement(int[] arr) {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }
    }
}
