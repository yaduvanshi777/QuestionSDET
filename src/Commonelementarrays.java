import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class Commonelementarrays {

        public static Set<Integer> findCommonElements(Integer[]... arrays) {
            Set<Integer> common = new HashSet<>(Arrays.asList(arrays[0]));
            for (int i = 1; i < arrays.length; i++) {
                common.retainAll(new HashSet<>(Arrays.asList(arrays[i])));
            }
            return common;
        }

        public static void main(String[] args) {
            Integer[] a1 = {1, 2, 3, 2, 1};
            Integer[] a2 = {1, 2, 3};
            Integer[] a3 = {1, 2, 3, 4};

            Set<Integer> result = findCommonElements(a1, a2, a3);
            System.out.println(result); // Output: [1, 2, 3]
        }
    }


