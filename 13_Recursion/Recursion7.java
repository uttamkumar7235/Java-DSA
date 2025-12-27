// First Occurrence

public class Recursion7 {

    public static int firstOccur(int arr[], int i, int key) {
        if(i == arr.length) {
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }
        return firstOccur(arr, i+1, key);
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 5;

        System.out.println(firstOccur(arr, 0, key));   
    }
}
