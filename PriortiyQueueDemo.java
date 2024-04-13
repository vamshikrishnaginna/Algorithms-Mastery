import java.util.*;

public class PriortiyQueueDemo {

  public static void main(String[] args) {

    PriorityQueue<Integer> pq = new PriorityQueue<>();

    pq.offer(20);
    pq.offer(44);
    pq.offer(5);
    pq.offer(15);

    pq.poll();
    System.out.println(pq);
    System.out.println(pq.peek());

  }

}
