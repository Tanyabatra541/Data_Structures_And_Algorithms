import java.util.Arrays;

public class bubbleSortRecursion {
  public static void main(String[] args) {
    int[] arr = {5,1,3,42};
    int i=0;
    int j=1;
    int[] ans = bubble(arr, i, j);
    System.out.println(Arrays.toString(ans));
  }
  static int[] bubble(int[] arr, int i, int j){
    if(i<arr.length) {
      if(j<arr.length - i) {
        if(arr[j]<arr[j-1]){
          int temp = arr[j];
          arr[j] = arr[j-1];
          arr[j-1] = temp;
        }
        bubble(arr, i, j+1);
      }
      bubble(arr, i + 1, j);
    } else {
      return arr;
    }
    return arr;
  }
}
