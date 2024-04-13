import java.util.*;

public class DequeDemo {

  public static void main(String[] args) {
    ArrayDeque<Integer> ad = new ArrayDeque<>();

    // using it like a stack

    // inserting from the last
    ad.offerLast(10);
    ad.offerLast(20);
    ad.offerLast(30);

    ad.forEach((x) -> {
      System.out.println(x);
    });

    // deleting from the last is stack
    System.out.println("xxxxxxxxxxxxxxx");
    ad.pollLast();
    ad.forEach((x) -> {
      System.out.println(x);
    });

    // deleting from the first is stack
    System.out.println("xxxxxxxxxxxxxxx");
    ad.pollFirst();
    ad.forEach((x) -> {
      System.out.println(x);
    });

    System.out.println("xxxxxxxxxxxxxxx");

    // ad.offerFirst(91);
    // ad.offerFirst(92);
    // ad.offerFirst(93);

    // ad.forEach((x) -> {
    // System.out.println(x);
    // });

  }
}
