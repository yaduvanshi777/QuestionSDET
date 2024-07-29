package sorting.search;

public class BinarySearch {
    public static int binarySearch(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) return mid;
            if (arr[mid] < x) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 8};
        int x = 5;
        int result = binarySearch(arr, x);
        System.out.println(result); // Output: 3 (index of 5 in sorted array)
    }
}
