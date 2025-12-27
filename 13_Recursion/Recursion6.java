// Check whether an Array is sorted or not

public class Recursion6 {
    
    public static boolean isSorted(int arr[], int i) {
        if(i == arr.length-1) {
            return true;
        }
        if(arr[i] > arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 58, 20, 53};
        
        if(isSorted(arr, 0)) {
            System.out.println("Array is sorted.");
        }
        else {
            System.out.println("Array is not sorted.");
        }
    }
}
