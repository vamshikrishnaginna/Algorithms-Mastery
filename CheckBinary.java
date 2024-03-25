public class CheckBinary {

  public static void main(String[] args) {
    // Find if a number is a binary number or not

    String binaryNumStr = "10101010100001111";

    if (binaryNumStr.matches("[10]*"))
      System.out.println("Given number is binary");
    else
      System.out.println("Given number is NOT binary");

    // find if a number is hexa decimal or not
    String hexaDecString = "0123456789ABCDEF";
    if (hexaDecString.matches("[a-fA-F0-9]+"))
      System.out.println("Given number is Hexa decimal");
    else
      System.out.println("Given number is NOT Hexa decimal");

    // Find if the date is in date format dd/mm/yyyy
    String dateStr = "12/05/2012";
    if (dateStr.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"))
      System.out.println("The date format is correct");
    else
      System.out.println("The date format is incorrect");

  }

}
