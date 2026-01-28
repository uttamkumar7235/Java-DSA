import java.util.ArrayList;

public class Classroom {
  public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList<>();

    // Add Operation - O(1)
    list1.add(1);
    list1.add(2);
    list1.add(3);
    list1.add(4);

    list1.add(4, 5);

    System.out.println(list1);

    // Get Operation - O(1)
    // int element = list1.get(2);
    // System.out.println(element);

    // Remove Operation - O(n)
    // list1.remove(2);
    // System.out.println(list1);

    // Set Element at Index - O(n)
    // list1.set(2, 10);
    // System.out.println(list1);

    // Contains element - O(n)
    // System.out.println(list1.contains(10));

  }
}