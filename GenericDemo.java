class Data<T> {
  private T obj;

  public void setData(T obj) {
    this.obj = obj;
  }

  public T getData() {
    return obj;
  }

}

public class GenericDemo {

  public static void main(String[] args) {
    Data<String> d = new Data<>();

    d.setData("dsd");

    System.out.println(d.getData());
  }

}
