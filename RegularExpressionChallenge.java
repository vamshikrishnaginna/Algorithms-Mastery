import java.util.Scanner;
import java.lang.*;

public class RegularExpressionChallenge {
  // student challenge 1 for regular expressions
  // find if the email id is on gmail
  // extract username and domain name from email

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your email address");
    String emailId = sc.next();

    if (!emailId.matches("\\w+@gmail.com")) {
      System.out.println("Invaild email id " + emailId);
    } else {
      int indexOfGmail = emailId.indexOf("gmail");
      System.out.println("Hello " + emailId.substring(0, indexOfGmail - 1));
    }

  }

}
