public class WrapperClassDemo {

  public static void main(String[] args) {

    // Integer num = new Integer(10); // this method is deprecated
    Integer num2 = Integer.valueOf(10); // modern and valid method

    Byte c = 15;
    Byte d = Byte.valueOf("15");

    byte bb = 15;
    // Byte e= Byte.valueOf(15); //Error: can not take int value as input directly
    Byte e = Byte.valueOf(bb);

    Short f = Short.valueOf("123");

    Float h = Float.valueOf("1.25");
    Double i = Double.valueOf("12126.1654165");

    // Character k = Character.valueOf("A");
    Character k = Character.valueOf('A'); // use single quotes

    System.out.println(Integer.bitCount(555555));
    System.out.println(Integer.reverse(8));
    System.out.println(Integer.toBinaryString(8));

  }

}
