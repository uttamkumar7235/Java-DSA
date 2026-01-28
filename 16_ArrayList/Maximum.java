import java.util.ArrayList;

public class Maximum {

  public static Integer maximum(ArrayList<Integer> list) {

    int max = Integer.MIN_VALUE;

    for (int i=0; i<list.size(); i++) {
      max = Math.max(max, list.get(i));
    }

    return max; 
  }
  
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(6);
    list.add(8);
    list.add(7);
    list.add(3);
    list.add(15);

    System.out.println(list);

    System.out.println("Max value = " + maximum(list));

  }
}
