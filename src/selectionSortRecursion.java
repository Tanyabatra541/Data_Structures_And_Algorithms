import java.util.Arrays;

public class selectionSortRecursion {
  public static void main(String[] args) {
    int[] arr = {3, 1, 4, 2, 5};
    int i=0;
    int[] ans = selection(arr, i, i +1);
    System.out.println(Arrays.toString(ans));
  }

  static int[] selection(int[] arr, int i, int j) {
    int n = arr.length;
    if(i<n-1){
      int min_index = i;
      if(j<n) {
        if(arr[j] < arr[min_index]) {
          min_index = j;
        }
        selection(arr, i, j+1);
      }
      int temp = arr[min_index];
      arr[min_index] = arr[i];
      arr[i] = temp;
      selection(arr, i+1, i+1);
    } else {
      return arr;
    }
    return arr;
  }
}

