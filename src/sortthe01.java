import java.util.Arrays;

public class sortthe01 {

    // sort this array [11010101101110001] without using .sort fucnction
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,0,1,0,1,1,0,1,1,1,0,0,0,1};
//        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));


    }
//
//    public static void main(String[] args) {
//        int[] arr = {1,1,0,1,0,1,0,1,1,0,1,1,1,0,0,0,1};
//        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
}
