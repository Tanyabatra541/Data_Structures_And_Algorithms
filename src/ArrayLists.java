import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    for(int i = 0; i< 5; i++) {
      numbers.add(scanner.nextInt());
    }
    System.out.println(numbers);
  }
}
