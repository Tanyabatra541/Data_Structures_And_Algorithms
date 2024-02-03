public class Recursion1 {
  public static void main(String[] args) {
    int n=0;
    message(n);
  }

  static void message(int n) {
    if (n == 5) {
      return;
    }
    System.out.println(n+1);
    n++;
    message(n);

  }
}
