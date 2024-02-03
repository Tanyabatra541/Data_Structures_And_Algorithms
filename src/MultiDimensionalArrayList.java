import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
    //initialize the matrix (don't forget this)
    for (int i = 0; i < 5; i++) {
      matrix.add(new ArrayList<Integer>());
    }
    for(int i = 0; i < 5; i++) {
      for(int j = 0; j < 5; j++) {
        matrix.get(i).add(in.nextInt());
      }
    }
    System.out.println(matrix);
  }
}
