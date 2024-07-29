package sorting;

public class countnumberofpair  {

    //To determine the number of pairs in the array {1, 1, 2, 3, 2, -1, -3, 4, 4, -3, 4, 4}, we'll consider pairs of elements that are the same.
    // count is 5
    // This method has a time complexity of O(n^2) due to the nested loop.


    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 2, -1, -3, 4, 4, -3, 4, 4};
        int count = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i + 1; j <arr.length-1; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println("Number of pairs: " + count);
    }
}
