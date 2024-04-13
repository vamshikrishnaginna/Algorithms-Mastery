import java.util.*;

public class LinkedHashMapDemo {

  public static void main(String[] args) {

    LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5);

    lhm.put(1, "A");
    lhm.put(2, "B");
    lhm.put(3, "C");
    lhm.put(4, "D");
    lhm.put(5, "E");
    lhm.put(9, "I");
    lhm.put(7, "G ");
    lhm.put(26, "Z");

    System.out.println(lhm);

  }

}
