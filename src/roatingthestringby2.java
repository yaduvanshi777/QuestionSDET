public class roatingthestringby2 {

    static boolean isRotated(String str1, String str2)
    {
        int n = str1.length();
        int m = str2.length();
        if (n != m) //check both the string length equal or not
            return false;
        boolean clockwise = true;
        boolean anticlockwise = true;
        //check clockwise rotation is possible or not
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i)!= str2.charAt((i + 2) % n)) {
                clockwise = false;
                break;
            }
        }
        // check anticlockwise rotation is possible or not
        for (int i = 0; i < m; i++) {
            if (str1.charAt((i + 2) % n)!= str2.charAt(i)) {
                anticlockwise = false;
                break;
            }
        }
        return (clockwise || anticlockwise);
    }
    public static void main (String[] args) {
        String str1 = "geeks";
        String str2 = "eksge";

        System.out.println(isRotated(str1, str2) ? "Yes"
                : "No");
    }

}
