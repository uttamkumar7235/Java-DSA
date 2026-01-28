import java.util.ArrayList;

public class Swap {

  public static void swapTwoNumbers(ArrayList<Integer> list, int idx1, int idx2) {

    int temp = list.get(idx1);
    list.set(idx1, list.get(idx2));
    list.set(idx2, temp);

  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(6);
    list.add(8);
    list.add(7);
    list.add(3);
    list.add(15);

    int idx1 = 1;
    int idx2 = 3;

    System.out.println("Before Swapping : " + list);
    System.out.println("Index 1 = " + idx1);
    System.out.println("Index 2 = " + idx2);

    swapTwoNumbers(list, idx1, idx2);
    System.out.println("After Swapping : " + list);

  }
}
