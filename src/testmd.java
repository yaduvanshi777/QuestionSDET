public class testmd {

    // print the program to the asc order for the number
    public static  void main (String[] args)
    {
        int[] arr  = new int [] { 5 ,2,3,7,1};
        int temp;

        System.out.println("element of the array ");
        for (int k : arr) {
            System.out.println(k + "");
        }

        for(int i=0 ;i<arr.length;i++)
        {
            for(int j = i+1; j <arr.length;j++)
            {
                if(arr[i]>arr[j])  // it for ascending order
               //     if(arr[i]<arr[j]) // it for descending order
                {
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("asc order ");
        for (int j : arr) {
            System.out.println(j + " ");
        }

    }
}
