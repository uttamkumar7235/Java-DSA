// Queue using Java Collection Framework

import java.util.*;

public class QueueJCF {

 public static void main(String[] args) {
  Queue<Integer> q = new LinkedList<>();

  q.add(10);
  q.add(20);
  q.add(30);

  while (!q.isEmpty()) {
    System.out.println(q.peek());
    q.remove();
  }

 }
}
