
@FunctionalInterface
/**
 * MyLambda
 */
interface MyLambda {

  public void display(String str);

}

public class LambdaDemo {

  public static void main(String[] args) {

    MyLambda m = (s) -> {
      System.out.println("hello " + s);
    };

    m.display("World");

  }

}
