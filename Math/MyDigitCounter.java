import java.math.BigInteger;

public class MyDigitCounter {

  public static int countDigits(int x) {

    int count = 0;
    while (x > 0) {
      x = x / 10;
      count++;
    }
    return count;

  }

  public static String isPalindrome(long x) {
    long n = x;
    long rev = 0;
    while (n > 0) {
      rev = (rev * 10) + (n % 10);
      n = n / 10;
    }

    if (rev == x)
      return "Yes";
    else
      return "No";
  }

  public static BigInteger fact(BigInteger x) {
    // System.out.println(x);
    BigInteger result;

    if (x.equals(BigInteger.valueOf(0)) || x.equals(BigInteger.valueOf(1)))
      return BigInteger.valueOf(1);

    result = x.multiply(fact(x.subtract(BigInteger.valueOf(1))));

    return result;
  }

  public static int trailingFactZeros(int x) {
    BigInteger fact = fact(BigInteger.valueOf(x));
    String strFact = fact.toString();
    int n = strFact.length();
    int count = 0;
    System.out.println(strFact);
    System.out.println(strFact.length());
    for (int i = n; i > 0; i--) {
      if (strFact.charAt(i - 1) == '0')
        count++;
      else
        break;
    }

    // while (fact % 10 == 0) {
    // count++;
    // fact = fact / 10;

    // }
    return count;
  }

  public static void printPrime(int n) {
    int count = 0;
    System.out.println("Printing Prime Numbers less than " + n);

    for (int i = 2; i <= n; i++) {
      // System.out.println("i=" + i);
      for (int j = 2; j <= i; j++) {
        if (i % j == 0)
          // System.out.println("j=" + j);
          count++;
      }
      if (count == 1)
        System.out.print(i + " ");

      count = 0;

    }

    System.out.println("");
  }

  public static boolean isPrime(int n) {

    if (n == 1)
      return false;
    if (n == 2 || n == 3)
      return true;

    if (n % 2 == 0 || n % 3 == 0)
      return false;

    for (int i = 5; i * i <= n; i = i + 6) {
      if (n % i == 0 || n % (i + 2) == 0)
        return false;
    }

    return true;

  }

  public static void printPrimeFactors(int n) {

    for (int i = 2; i <= n; i++) {
      if (isPrime(i) && n % i == 0) {
        int x = i;
        while (n % x == 0) {
          System.out.println(i);
          x = x * i;
        }

      }
    }

  }

  public static void main(String[] args) {

    // Digit counter
    System.out.println("Digit counter x= 465450");
    System.out.println(countDigits(465450));

    // Is Palindrome
    System.out.println("Is Palindrome x= 8899559988");
    System.out.println(isPalindrome(8899559988l));
    System.out.println("Is Palindrome x= 883365");
    System.out.println(isPalindrome(883365));

    // Factorial of a number
    System.out.println("Factorial of 4");
    System.out.println(fact(BigInteger.valueOf(4)));
    System.out.println("Factorial of 0");
    System.out.println(fact(BigInteger.valueOf(0)));
    System.out.println("Factorial of 100");
    System.out.println(fact(BigInteger.valueOf(100)));

    // Trailing Zeros in factorial number
    System.out.println("Number of Trailing zeros in fact(4)");
    System.out.println(trailingFactZeros(4));
    System.out.println("Number of Trailing zeros in fact(5)");
    System.out.println(trailingFactZeros(5));
    System.out.println("Number of Trailing zeros in fact(10)");
    System.out.println(trailingFactZeros(10));
    System.out.println("Number of Trailing zeros in fact(100)");
    System.out.println(trailingFactZeros(100));

    // printPrime(10);
    // printPrime(23);
    printPrimeFactors(12);

  }

}
