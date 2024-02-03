public class SkipStringRecursion {
  public static void main(String[] args) {
    System.out.println(skipString("abcdappledhf"));
  }
  static String skipString(String s) {
    if (s.isEmpty()) {
      return "";
    }

    if(s.startsWith("apple")){
      return skipString(s.substring(3));
    }
    else {
      return s.charAt(0) + skipString(s.substring(1));
    }
  }
}
