// Fractional Knapsack Using Greedy Algorithm

import java.util.*;

public class FractionalKnapsack {

  public static void main(String[] args) {
    int value[] = {60, 100, 120};
    int weight[] = {10, 20, 30};
    int W = 50;

    double ratio[][] = new double[value.length][2];
    
    // value per unit weight
    for (int i=0; i<value.length; i++) {
      ratio[i][0] = i;
      ratio[i][1] = (double) value[i]/weight[i];
    }

    Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

    int capacity = W;
    double finalValue = 0;

    // Traverse from highest ratio to lowest ratio
    for (int i=ratio.length-1; i>=0; i--) {
      int idx = (int) ratio[i][0];
      if (capacity >= weight[idx]) { // if whole item can fit
        finalValue += value[idx];
        capacity -= weight[idx];
      }
      else { // otherwise take fraction
        finalValue += ratio[i][1]*capacity;
        capacity = 0;
        break;
      }
    }

    System.out.println("Maximum Value: " + finalValue);
  }
}