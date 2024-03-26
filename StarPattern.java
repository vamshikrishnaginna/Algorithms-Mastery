public class StarPattern {

  public static void main(String[] args) {

    // print pattern
    // ******
    // *****
    // ****
    // ***
    // **
    // *

    int n = 5;

    for (int i = n; i >= 0; i--) {
      System.out.print(" ".repeat(n - i));
      for (int j = i; j >= 0; j--) {
        System.out.print("*");
      }
      System.out.println("");

    }
  }

}
