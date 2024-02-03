import java.util.ArrayList;

public class LinearSearchRangeRecursion {
  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(2);
    arr.add(5);
    arr.add(6);
    arr.add(6);
    arr.add(9);
    arr.add(10);
    System.out.println(search2(arr, 6, 0));
  }

  static ArrayList<Integer> search(ArrayList<Integer> arr, int target, int i, ArrayList<Integer> ans){
    if (i == arr.size()) {
      return ans;
    }
    if (arr.get(i) == target) {
      ans.add(i);
    }
    return search(arr, target, i + 1, ans);
  }

  static ArrayList<Integer> search2(ArrayList<Integer> arr, int target, int i){
    ArrayList<Integer> ans = new ArrayList<>();
    if (i == arr.size()) {
      return ans;
    }
    if (arr.get(i) == target) {
      ans.add(i);
    }
    ArrayList<Integer> allAns = search2(arr, target, i + 1);
    ans.addAll(allAns);
    return ans;
  }
}
