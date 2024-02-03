import java.util.Scanner;

public class MaxValue {
  public static void main(String[] args) {
    int[] arr = new int[5];
    int max = arr[0];
    Scanner s = new Scanner(System.in);
    for(int i=0;i<5;i++){
      arr[i] = s.nextInt();
    }
    for(int i=0;i<5;i++){
      if(arr[i]>max){
        max = arr[i];
      }
    }
    System.out.println("Maximum is:" + max);
  }
}
