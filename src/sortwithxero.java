import java.util.Arrays;

public class sortwithxero {

    public static void main(String[] args) {
        int[] arr = {140, 0, 25, 2, 0, 8, 0, 17, 0};
        moveZerosToFront(arr);
        System.out.println(Arrays.toString(arr));
    }
        public static void moveZerosToFront(int[] arr) {
            int count = 0; // Count of non-zero elements

             //Move non-zero elements to the beginning
            for(int i = 0 ; i < arr.length; i++) {
                if(arr[i] !=0)
                {
                    int temp;
                    temp = arr[count];
                    arr[count] = arr[i];
                    arr[i] = temp;
                    count++;

                }
            }
            // Move non-zero elements to the end
            for(int i = 0 ; i < arr.length; i++) {
                if(arr[i] ==0)
                {
                    int temp;
                    temp = arr[count];
                    arr[count] = arr[i];
                    arr[i] = temp;
                    count++;

               }
            }

        }
    }


