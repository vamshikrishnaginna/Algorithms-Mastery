import java.util.*;

public class TreeMapDemo {

  public static void main(String[] args) {
    TreeMap<Integer, String> tm = new TreeMap<>();

    tm.put(1, "Vamshi");
    tm.put(2, "Dagad Sai");
    tm.put(3, "saketh");
    tm.put(4, "sai ram");

    System.out.println(tm);
    System.out.println(tm.entrySet());
    System.out.println(tm.firstEntry());
    System.out.println(tm.lastEntry());
    System.out.println(tm.ceilingKey(0));
    System.out.println(tm.lastEntry());
    System.out.println(tm.lowerEntry(3));

  }

}
