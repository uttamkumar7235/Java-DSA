import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(6);
    list.add(8);
    list.add(7);
    list.add(3);
    list.add(15);

    System.out.println("Original list : " + list);

    // Ascending order
    Collections.sort(list);
    System.out.println("Ascending order sorting : " + list);

    // Descending order
    Collections.sort(list, Collections.reverseOrder());
    System.out.println("Descending order sorting : " + list);

  }
}
