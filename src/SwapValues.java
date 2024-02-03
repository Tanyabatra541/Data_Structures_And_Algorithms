import java.util.ArrayList;
import java.util.Scanner;

public class SwapValues {
  public static void main(String[] args) {
//    ArrayList<Integer> arr = new ArrayList<>();
    int[] arr = new int[6];
    int temp;
    Scanner s = new Scanner(System.in);
    for(int i=0;i<6;i++){
      arr[i] = s.nextInt();
    }
    for(int i=0;i<6;i++){
      temp = arr[i];
      arr[i] = arr[7-i];
      arr[arr.length-1] = temp;
    }
    for (int j : arr) {
      System.out.println(j);
    }
  }
}
