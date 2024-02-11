import java.util.ArrayList;
import java.util.Arrays;

public class PermutationsRecursion {
  public static void main(String[] args) {
    int count=0;
    ArrayList<String> ans = permutations("", "abc", count);
    System.out.println("Number of permutations is: " + ans.size());
  }

  static ArrayList<String> permutations(String p, String up, int count){
    if(up.isEmpty()) {
      ArrayList<String> ans = new ArrayList<>();
      ans.add(p);
      return ans;
    }
    char ch = up.charAt(0);
    ArrayList<String> left;
    ArrayList<String> temp = new ArrayList<>();

    for(int i=0;i<=p.length();i++){
      String f = p.substring(0,i);
      String s = p.substring(i,p.length());
      left = permutations(f + ch + s, up.substring(1), count);
      temp.addAll(left);
      count++;
    }
    return temp;
  }

  static void permutationsWithout(String p, String up){
    if(up.isEmpty()) {
      System.out.println(p);
      return;
    }
    char ch = up.charAt(0);
    ArrayList<String> left;
    ArrayList<String> temp = new ArrayList<>();

    for(int i=0;i<=p.length();i++){
      String f = p.substring(0,i);
      String s = p.substring(i,p.length());
      permutationsWithout(f+ch+s, up.substring(1));
    }
  }
}
