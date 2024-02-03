public class linearSearch {
  public static void main(String[] args) {
    int flag = 0;
    int target = 14;
    int[] arr = {1,3,4,5,2};
    for(int i=0;i<5;i++){
      if(arr[i] == target){
        flag = 1;
      }
    }
    if(flag == 0){
      System.out.println("Element not found");
    }
    else{
      System.out.println("Element found");
    }
  }
}
