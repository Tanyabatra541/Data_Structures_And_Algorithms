import java.util.Scanner;

public class palindromeString {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String name = s.next();
    int start = 0;
    int end = name.length()-1;
    System.out.println(name.length());
    while(start<=end) {
      if (name.charAt(start) == name.charAt(end)) {
        start++;
        end--;
      } else {
        System.out.println("no");
        break;
      }
    }
    System.out.println("yes");
  }
}
