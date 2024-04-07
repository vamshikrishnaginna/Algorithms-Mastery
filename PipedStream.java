// class MyData {

//   char c;

//   void writeC(char c) {
//     this.c = c;
//   }

//   char readC() {

//     return c;
//   }

// }

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Producer extends Thread {

  OutputStream os;

  Producer(OutputStream os) {
    this.os = os;
  };

  public void run() {
    int count = 1;

    while (true) {
      try {
        os.write(count);
        os.flush();

        System.out.println("Procducer:" + count);
        System.out.flush();
        Thread.sleep(10);
        count++;
      } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e);
      }
    }

  }

}

class Consumer extends Thread {

  InputStream is;

  Consumer(InputStream is) {
    this.is = is;
  };

  public void run() {
    int x;

    while (true) {
      try {
        x = is.read();

        System.out.println("Consumer consumed:" + x);
        System.out.flush();
        Thread.sleep(10);
      } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e);
      }
    }

  }

}

public class PipedStream {

  public static void main(String[] args) {

    try {
      PipedInputStream pis = new PipedInputStream();
      PipedOutputStream pos = new PipedOutputStream();

      pos.connect(pis);

      Producer p = new Producer(pos);
      Consumer c = new Consumer(pis);
      p.start();
      c.start();
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println(e);
    }

  }

}
