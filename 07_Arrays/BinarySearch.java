public class BinarySearch {
    
    // Iterative Binary Search
    public static int binarySearch(int arr[], int key) {

        int si = 0; // starting index
        int ei = arr.length-1; // ending index

        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            else if (arr[mid] > key) {
                ei = mid - 1;
            }
            else {
                si = mid + 1;
            }
        }

        return -1; // not found
    }

    // Recursive binary search
    static int RecurisveBinSearch(int[] arr, int si, int ei, int key) {
    if (si > ei) {
        return -1;
    }

    int mid = si + (ei - si) / 2;

    if (arr[mid] == key) {
        return mid;
    }
    else if (key < arr[mid]) {
        return RecurisveBinSearch(arr, si, mid - 1, key);
    }
    else {
        return RecurisveBinSearch(arr, mid + 1, ei, key);
    }

}


    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40, 50}; // array must be sorted
        int key = 40;

        int result = binarySearch(arr, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        }
        else {
            System.out.println("Element not found.");
        }

        // Using Recursive function

        // int res = RecurisveBinSearch(arr, 0, arr.length-1, key);
        // if (res != -1) {
        //     System.out.println("Element found at index: " + res);
        // }
        // else {
        //     System.out.println("Element not found.");
        // }
    }
    
}
