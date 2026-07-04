// Indian Coins Problem (Greedy Algorithm)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {

  public static void main(String[] args) {

    // Available Indian coin/note denominations (ascending order)
    Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };

    int amount = 1059;
    int count = 0;

    Arrays.sort(coins, Comparator.reverseOrder());

    ArrayList<Integer> ans = new ArrayList<>();

    for (int i=0; i<coins.length; i++) {

      if (coins[i] <= amount) {

        while (coins[i] <= amount) {
          count++;
          ans.add(coins[i]);
          amount -= coins[i];
        }
      }
    }

    System.out.println("Total coins/notes used: " + count);
    
    for (int i=0; i<ans.size(); i++) {
      System.out.print(ans.get(i) + " ");
    }
  }
}