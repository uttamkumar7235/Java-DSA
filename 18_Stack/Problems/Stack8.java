// Max Rectagular Area in Histogram

import java.util.*;

public class Stack8 {

  public static int maxArea(int heights[]) {
    int n = heights.length;
    int maxArea = 0;

    int nsl[] = new int[n];
    int nsr[] = new int[n];

    Stack<Integer> s = new Stack<>();

    // Nearest Smaller Right - nsr[]
    for(int i=n-1; i>=0; i--) {
      while(!s.isEmpty() && heights[s.peek()] >= heights[i]) {
        s.pop();
      }

      if (s.isEmpty()) {
        nsr[i] = n;
      }
      else {
        nsr[i] = s.peek();
      }

      s.push(i);
    }

    // Nearest Smaller Left - nsl[]
    s.clear();

    for(int i=0; i<n; i++) {
      while(!s.isEmpty() && heights[s.peek()] >= heights[i]) {
        s.pop();
      }

      if (s.isEmpty()) {
        nsl[i] = -1;
      }
      else {
        nsl[i] = s.peek();
      }

      s.push(i);
    }
    
    // Area
    for (int i=0; i<n; i++) {
      int height = heights[i];
      int width = nsr[i] - nsl[i] -1;
      int currArea = height * width;
      maxArea = Math.max(maxArea, currArea);
    }

    return maxArea;

  }

  public static void main(String[] args) {
    int arr[] = {2, 1, 5, 6, 2, 3};
    System.out.println("Maximum rectangular area in Histogram: " + maxArea(arr));
  }
}
