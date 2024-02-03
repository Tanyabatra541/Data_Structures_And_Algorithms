public class RemoveAFromStringRecursion {
  public static void main(String[] args) {
    String s = "baccad";
    remove(s, "");
  }

  static void remove(String s, String ans) {
    if (s.isEmpty()) {
      System.out.println(ans);
      return;
    }
    char ch = s.charAt(0);
    if (ch == 'a') {
      remove(s.substring(1), ans);
    } else {
      remove(s.substring(1), ans + ch);
    }
  }
}
