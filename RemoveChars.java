public class RemoveChars {

  public static void main(String[] args) {

    // Remove the speical characters from a string

    String str = "a%dbkjshd^&$%^%bcs";
    String str2 = "";

    for (int i = 0; i < str.length(); i++) {
      if (String.valueOf(str.charAt(i)).matches("\\w")) {
        str2 += str.charAt(i);
      }
    }

    System.out.println(str2);
  }

}
