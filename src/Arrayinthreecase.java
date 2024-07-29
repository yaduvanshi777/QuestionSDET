import java.util.HashSet;
import java.util.Set;

public class Arrayinthreecase {

    public  static void main(String[] args){

        int[] arr = {1, 2, 3, 4, 5, 2, 3, 4, 2, 1, 2, 3, 4, 0, -1, 2, 4, 51, 2};
        Set<Integer> set = new HashSet<>();
      //  Set<Integer> duplicates = new HashSet<>();
//        for (int i= 0 ;i<arr.length;i++) {
//            if  (arr[i] >=0){
//
//                set.add(arr[i]);
//
//            }
//        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    if(arr[temp] >=0){

                    set.add(temp);}
//                } else if (arr[temp] >=0) {
//                    set.add(arr[temp]);
//                }

            }
        }

        System.out.println(" "+set);

        // this set use as array


        // now sort the array




    }




}}


