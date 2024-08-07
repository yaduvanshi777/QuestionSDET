import java.util.*;
public class reversearrya {
    public static void main(String[] args) {
        int[] arr = {1, 2, 9, 4, 5};
        reversearr(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reversearr(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }



}
