// Activity Selection Problem Using Greedy Algorithm

import java.util.*;

public class ActivitySelection {
  
  public static void main(String[] args) {
    int start[] = {0, 1, 5, 5, 8, 3};
    int end[] = {6, 2, 7, 9, 9, 4};

    // Step 1: Sort by end time
    int activities[][] = new int[start.length][3];

    for (int i=0; i<start.length; i++) {
      activities[i][0] = i;
      activities[i][1] = start[i];
      activities[i][2] = end[i];
    }
    Arrays.sort(activities, Comparator.comparingInt(o -> o[2]));

    ArrayList<Integer> ans = new ArrayList<>();

    // Step 2: Select first activity
    int maxAct = 1;
    ans.add(activities[0][0]);

    // Step 3: Select remaining
    int lastEnd = activities[0][2];
    for (int i=1; i<activities.length; i++) {
      if (activities[i][1] >= lastEnd) {
        maxAct++;
        ans.add(activities[i][0]);
        lastEnd = activities[i][2];
      }
    }

    // Print
    System.out.println("Max Activities: " +maxAct);

    System.out.println("Selected activities: ");
    for (int i=0; i<ans.size(); i++) {
      System.out.println("A" + ans.get(i));
    }

  }
}
