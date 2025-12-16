public class ReverseArray {

    public static void reverse(int arr[]) {

        int first = 0, last = arr.length-1;

        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
    }

    public static void printArray(int arr[]) {

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main (String args[]) {
        
        int arr[] = {2,4,6,8,7,9,3};
        System.out.print("Original Array : ");
        printArray(arr);

        reverse(arr);
        System.out.print("Reversed Array : ");
        printArray(arr);

    }
}