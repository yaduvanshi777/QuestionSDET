import java.util.*;

public class Dulicatearray {


        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};
            Set<Integer> set = new HashSet<>();
            Set<Integer> duplicates = new HashSet<>();
            for (int num : arr) {
                if (!set.add(num)) {
                    duplicates.add(num);
                }
            }
            System.out.println("Duplicate elements: " + duplicates);
        }
    }
