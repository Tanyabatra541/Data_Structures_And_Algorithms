public class RemoveAFromStringRecursion {
  public static void main(String[] args) {
    String s = "baccad";
    System.out.println(remove(s));
  }

  static String remove(String s) {
    if (s.isEmpty()) {
      return "";
    }
    char ch = s.charAt(0);
    if (ch == 'a') {
      return remove(s.substring(1));
    } else {
      return ch + remove(s.substring(1));
    }
  }
}
