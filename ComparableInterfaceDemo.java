import java.util.*;

class Point implements Comparable {
  int x, y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int compareTo(Object o) {

    Point p = (Point) o;
    if (this.x < p.x) {
      return -1;
    } else if (this.x > p.x) {
      return 1;
    } else {

      if (this.y < p.y)
        return -1;
      else if (this.y > p.y)
        return 1;
      else
        return 0;

    }
  }

  public String toString() {
    return "x=" + this.x + " y=" + this.y;

  }

}

public class ComparableInterfaceDemo {

  public static void main(String[] args) {

    TreeSet<Point> ts = new TreeSet<>();

    ts.add(new Point(1, 1));
    ts.add(new Point(5, 5));
    ts.add(new Point(2, 2));

    System.out.println(ts);

  }

}
