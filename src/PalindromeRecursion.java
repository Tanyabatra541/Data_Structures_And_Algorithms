public class PalindromeRecursion {
  public static void main(String[] args) {
    int n = 12345;
    int reversed_n = reverse2(12321);
    if(n==reversed_n) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not a Palindrome");
    }
  }
  static int helper(int n, int digits){
    if(n%10==n){
      return n;
    }
    int rem = n%10;
    return (int)(rem * Math.pow(10,digits-1) + helper(n/10,digits-1));
  }
  static int reverse2(int n){
    int digits = (int)(Math.log10(n) + 1);
    return(helper(n,digits));
  }
}
