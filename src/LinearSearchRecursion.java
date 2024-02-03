public class LinearSearchRecursion {
  public static void main(String[] args) {
    int[] arr = {1, 3, 4, 7, 9};
    System.out.println(linear(arr, 0, 10));
    System.out.println(linearIndex(arr, 0, 10));
  }

  static boolean linear(int[] arr, int i, int target) {
    if (i == arr.length) {
      return false;
    }
    return arr[i] == target || linear(arr, i + 1, target);
  }

  static int linearIndex(int[] arr, int i, int target) {
    if (i == arr.length) {
      return -1;
    }
    if (arr[i] == target) {
      return i;
    } else {
      return linearIndex(arr, i + 1, target);
    }
  }
}
