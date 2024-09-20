import java.util.Collections;

public class array {
  public static void main(String[] args) {
    array<Integer> list = new array<Integer>();
    // Add Element
    list.add(0);
    list.add(3);
    list.add(5);
    System.out.println(list);

    // get element
    int element = list.get(1);
    System.out.println(element);

    // add between of the array;
    list.add(2, 4);
    System.out.println(list);

    // Set Function
    list.set(0, 9);
    System.out.println(list);

    // delete Function
    list.remove(3);
    System.out.println(list);

    // size of list

    int size = list.size();
    System.out.println(size);

    // loop Functions
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + "");
    }
    System.out.println();

    // Sort Function Collections
    Collections.sort(list);
    System.out.println(sort);
  }
}
