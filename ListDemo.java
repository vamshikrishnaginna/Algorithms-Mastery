import java.util.*;

public class ListDemo {

  public static void main(String[] args) {

    ArrayList<Integer> alist1 = new ArrayList<>(); // default capacity 10
    ArrayList<Integer> alist2 = new ArrayList<>(List.of(20, 30, 40, 25, 465, 5)); // default capacity 10

    alist1.add(10);
    alist1.add(0, 5);
    alist1.addAll(alist2);

    System.out.println(alist1);
    System.out.println(alist1.contains(203));
    System.out.println(alist1.get(4));
    System.out.println(alist1.indexOf(20));

    // accessing list elements one by one
    System.out.println(" Accessing list elements one by one");

    // regular for loop
    System.out.println("Regular for loop");

    for (int i = 0; i < alist1.size(); i++) {
      System.out.println(alist1.get(i));
    }

    System.out.println("Regular foreach loop");

    for (var x : alist1) {
      System.out.println(x);
    }

    System.out.println("Regular foreach loop lambda expressions");

    alist1.forEach((x) -> {
      System.out.println(x);
    });

    System.out.println("Iterator");

    Iterator<Integer> it = alist1.iterator();
    ListIterator<Integer> lit = alist1.listIterator(alist1.size());
    // while (it.hasNext()) {
    // System.out.println(it.next());
    // }
    while (lit.hasPrevious()) {
      System.out.println(lit.previous());
    }

  }

}
