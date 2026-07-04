import java.util.Arrays;

public class JobSequencing {

  static class Job {
    char id;
    int deadline;
    int profit;

    public Job (char id, int deadline, int profit) {
      this.id = id;
      this.deadline = deadline;
      this.profit = profit;
    }
  }

  public static void main(String[] args) {
    
    Job jobs[] = {
      new Job('A', 4, 20),
      new Job('B', 1, 10),
      new Job('C', 1, 40),
      new Job('D', 1, 30)
    };

    // Sort by profit descending
    Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

    // Find maximum deadline
    int maxDeadline = 0;
    for (Job j : jobs) {
      maxDeadline = Math.max(maxDeadline, j.deadline);
    }

    // Slot array stores scheduled jobs
    Job slots[] = new Job[maxDeadline];

    int totalProfit = 0;

    for (Job curr : jobs) {

      // place job in latest available free slot
      for (int j = curr.deadline - 1; j >= 0; j--) {
        if (slots[j] == null) {
          slots[j] = curr;
          totalProfit += curr.profit;
          break;
        }
      }
    }

    System.out.print("Scheduled Jobs: ");

    for (Job j : slots) {
      if (j != null) {
        System.err.print(j.id + " ");
      }
    }

    System.out.println("\nTotal Profit = " + totalProfit);

  }
}