public class Amstrong {
  public static void main(String[] args) {
    // Display digits int i=234;

    int n = 2345;

    // while (n > 0) {
    // System.out.println(n % Math.pow(10, 3));
    // n = n / 10;
    // }

    // Check if amstrong number

    int num = 153;
    int numBackup = num;
    int sum = 0, lastDigit = 0;
    while (num > 0) {
      lastDigit = num % 10;
      sum += (lastDigit * lastDigit * lastDigit);
      num = num / 10;
    }
    if (sum == numBackup) {
      System.out.println("Given number is Amstrong number");
    } else {

      System.out.println("Given number is NOT Amstrong number");
    }

  }
}
