public class SecondLargest {

  public static void main(String[] args) {

    // FIND THE SECOND LARGEST ELEMENT
    int A[] = { 3, 9, 7, 8, 12, 6, 15, 5, 4, 10, 13, 55, 77, 85, 99, 8, 4, 34, 7, 4, 6, 87, 98 };
    int max = 0, secMax = 0;

    for (int i = 0; i < A.length; i++) {

      if (max < A[i]) {
        secMax = max;
        max = A[i];
      }

      if (secMax < A[i] && A[i] < max)
        secMax = A[i];

      System.out.println("max, secMax, A[i] " + max + " " + secMax + " " + A[i]);

    }

    System.out.println(secMax);

  }

}
