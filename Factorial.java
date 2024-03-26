public class Factorial {

  public static void main(String[] args) {

    // find the factorial of a num

    int num = 5;
    int fact = 1;
    for (int i = 1; i <= num; i++) {
      fact = i * fact;
    }

    System.out.println(fact);

  }

}
