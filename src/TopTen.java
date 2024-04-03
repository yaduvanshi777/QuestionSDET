import java.util.Arrays;

public class TopTen  {

    public static void main(String[] args) {
        // 1. String reverse
        System.out.println(reverseString("hello"));

        // 2. Array reverse
        int[] array = {1, 2, 3, 4, 5};
        reverseArray(array);
        System.out.println(Arrays.toString(array));

        // 3. Reverse words
        System.out.println(reverseWords("hello world"));

        // 4. String palindrome
        System.out.println(isStringPalindrome("racecar"));

        // 5. Number palindrome
        System.out.println(isNumberPalindrome(12321));

        // 6. Max/min number from an array
        int[] numbers = {3, 5, 1, 9, 7};
        System.out.println(findMax(numbers));
        System.out.println(findMin(numbers));

        // 7. Find the second min/max number from an array
        System.out.println(findSecondMax(numbers));
        System.out.println(findSecondMin(numbers));

        // 8. Static keyword in Java (Explanation below)

        // 9. String Pool and == operator to compare references in Java (Explanation below)

        // 10. Swap values of two variables without direct reassignment and without creating any extra variables
        int a = 5, b = 10;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a: " + a + ", b: " + b);

        // 11. Two string anagram
        System.out.println(isAnagram("listen", "silent"));

        // 12. Remove duplicates from a string
        System.out.println(removeDuplicates("hello"));
    }

    // 1. String reverse
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // 2. Array reverse
    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    // 3. Reverse words
    public static String reverseWords(String str) {
        String[] words = str.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        return reversed.toString().trim();
    }

    // 4. String palindrome
    public static boolean isStringPalindrome(String str) {
        return str.contentEquals(new StringBuilder(str).reverse());
    }

    // 5. Number palindrome
    public static boolean isNumberPalindrome(int num) {
        return isStringPalindrome(Integer.toString(num));
    }

    // 6. Max/min number from an array
    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // 7. Find the second min/max number from an array
    public static int findSecondMax(int[] array) {
        int max = findMax(array);
        int secondMax = Integer.MIN_VALUE;
        for (int num : array) {
            if (num != max && num > secondMax) {
                secondMax = num;
            }
        }
        return secondMax;
    }

    public static int findSecondMin(int[] array) {
        int min = findMin(array);
        int secondMin = Integer.MAX_VALUE;
        for (int num : array) {
            if (num != min && num < secondMin) {
                secondMin = num;
            }
        }
        return secondMin;
    }

    // 8. Static keyword in Java (Explanation below)

    // 9. String Pool and == operator to compare references in Java (Explanation below)

    // 10. Swap values of two variables without direct reassignment and without creating any extra variables

    // 11. Two string anagram
    public static boolean isAnagram(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    // 12. Remove duplicates from a string
    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}
