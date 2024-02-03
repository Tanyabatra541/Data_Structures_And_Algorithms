import java.util.Scanner;

public class floorNumber {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int target = s.nextInt();
    int[] arr = new int[n];
    int finalans;
    int start=0;
    int end = n-1;
    for(int i=0;i<n;i++){
      arr[i] = s.nextInt();
    }
    finalans = binarySearch(arr,start,end, target);
    System.out.println("Answer is " + finalans);
  }
  static int binarySearch(int[] arr, int start, int end, int target){
    int mid;
    while(start<=end){
      mid = start+(end-start)/2;
      if(target<arr[mid]){
        end = mid -1;
      } else if(target>arr[mid]){
        start = mid + 1;
      } else {
        return arr[mid];
      }
    }
    return arr[end];
  }
}
