public class FindPrime {

  public static void main(String[] args) {
    int n = 91;
    int k = 0;

    for (int i = 1; i <= n; i++) {

      if (n % i == 0)
        k++;

      if (k > 2) {
        break;
      }
    }

    if (k > 2) {
      System.out.print("Not a prime");
    } else {
      System.out.println("Prime");
    }
  }
}
