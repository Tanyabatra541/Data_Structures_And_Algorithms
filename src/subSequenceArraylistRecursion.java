import java.util.ArrayList;

public class subSequenceArraylistRecursion {
  public static void main(String[] args) {
    System.out.println(sub("", "abc"));
  }

  static ArrayList<String> sub(String subSeq, String org) {
    if (org.isEmpty()) {
      ArrayList<String> ans = new ArrayList<>();
      ans.add(subSeq);
      return ans;
    }
    char ch = org.charAt(0);
    ArrayList<String> left = sub(subSeq + ch, org.substring(1));
    ArrayList<String> right = sub(subSeq, org.substring(1));
    ArrayList<String> ascii = sub(subSeq +  (int) ch, org.substring(1));

    left.addAll(right);
    left.addAll(ascii);
    return left;

  }
}
