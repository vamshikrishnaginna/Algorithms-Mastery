public class TwoDArray {

  public static void main(String[] args) {

    int m1[][] = { { 3, 5, 9 }, { 7, 6, 2 }, { 4, 3, 5 } };
    int m2[][] = { { 1, 5, 2 }, { 6, 8, 4 }, { 3, 9, 7 } };

    // Adding 2 matrices

    int addedMatrix[][] = new int[3][3];

    for (int i = 0; i < m1.length; i++) {
      for (int j = 0; j < m2.length; j++) {
        addedMatrix[i][j] = m1[i][j] + m2[i][j];
      }
    }

    for (int i = 0; i < m1.length; i++) {
      for (int j = 0; j < m2.length; j++) {
        System.out.print(addedMatrix[i][j]+ " ");
      }
      System.out.println(" ");
    }

    // Multiplying 2 matrices

    // Sorting array of Strings

  }

}
