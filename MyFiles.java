import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.plaf.metal.MetalIconFactory.FileIcon16;

public class MyFiles {

  public static void main(String[] args) {

    try {
      FileOutputStream fos = new FileOutputStream("output.txt");
      String str = "Hello Learn the Java Programing";

      // using byet Stream
      fos.write(str.getBytes());

      fos.close();

      FileInputStream fis = new FileInputStream("textDoc.txt");

      byte b[] = new byte[fis.available()];

      fis.read(b);

      String str2 = new String(b);

      System.out.println(str2);

    } catch (Exception e) {
      // TODO: handle exception
      System.out.println(e);
    }

  }

}
