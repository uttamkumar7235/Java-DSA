public class SearchInSR {

  // Recursive method - O(log n)
  public static int search(int arr[] , int tar, int si, int ei) {
    if (si > ei) {
      return -1;
    }
    int mid = si + (ei-si)/2;
    if (arr[mid] == tar) {
      return mid;
    }

    // Mid on L1
    if (arr[si] <= arr[mid]) {
      // case a : Left
      if (arr[si] <= tar && tar <= arr[mid]) {
        return search(arr, tar, si, mid-1);
      }
      // case b : Right
      else {
        return search(arr, tar, mid+1, ei);
      }
    }
    // Mid on L2
    else {
      // case c
      if (arr[mid] <= tar && tar <= arr[ei]) {
        return search(arr, tar, mid+1, ei);
      }
      // case d 
      else {
        return search(arr, tar, si, mid-1);
      }
    }
  }

  // // Iterative method - O(log n)
  // public static int search(int arr[], int target) {
  //   int si = 0;
  //   int ei = arr.length-1;

  //   while (si <= ei) {
  //     int mid = si + (ei-si)/2;
  //     if (arr[mid] == target) {
  //       return mid;
  //     }
  //     // If part 1 is sorted
  //     if (arr[si] <= arr[mid]) {
  //       if (arr[si] <= target && target <= arr[mid]) {
  //         ei = mid-1;
  //       }
  //       else {
  //         si = mid+1;
  //       }
  //     }
  //     // If part 2 is sorted
  //     else {
  //       if (arr[mid] <= target && target <= arr[ei]) {
  //         si = mid+1;
  //       }
  //       else {
  //         ei = mid-1;
  //       }
  //     }
  //   }
  //   return -1;
  // }

  public static void main(String[] args) {
    int arr[] = {4,5,6,7,0,1,2};
    int target = 0; // Output = 4
    int tarIdx = search(arr, target, 0, arr.length-1);
    System.out.println("Target found at index : " + tarIdx);
  }
}